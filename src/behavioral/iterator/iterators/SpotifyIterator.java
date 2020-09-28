package behavioral.iterator.iterators;

import behavioral.iterator.profile.Profile;
import behavioral.iterator.social_networks.Spotify;

import java.util.ArrayList;
import java.util.List;

public class SpotifyIterator implements ProfileIterator {
    private Spotify spotify;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public SpotifyIterator(Spotify spotify, String type, String email) {
        this.spotify = spotify;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = spotify.requestProfileFriendsFromSpotify(this.email, this.type);
            System.out.println(profiles);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = spotify.requestProfileFromSpotify(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
