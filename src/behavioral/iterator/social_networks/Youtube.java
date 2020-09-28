package behavioral.iterator.social_networks;

import behavioral.iterator.iterators.ProfileIterator;
import behavioral.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Youtube implements SocialNetwork{
    private List<Profile> profileList;

    public Youtube(List<Profile> profileList) {
        this.profileList = Objects.requireNonNullElseGet(profileList, ArrayList::new);
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public Profile requestProfileFromYoutube(String profileEmail) {
        // Here would be a POST request to one of the Spotify API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("Spotify: Loading profile '" + profileEmail + "' over the network...");

        // ...and return test data.
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromYoutube(String profileEmail, String contactType) {
        // Here would be a POST request to one of the Spotify API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("Spotify: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");

        // ...and return test data.
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profileList) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }


    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return null;
    }
}
