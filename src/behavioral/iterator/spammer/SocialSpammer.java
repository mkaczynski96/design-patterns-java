package behavioral.iterator.spammer;

import behavioral.iterator.iterators.ProfileIterator;
import behavioral.iterator.profile.Profile;
import behavioral.iterator.social_networks.SocialNetwork;

public class SocialSpammer {
    public SocialNetwork socialNetwork;
    public ProfileIterator profileIterator;


    public SocialSpammer(SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over friends...\n");
        profileIterator = socialNetwork.createFriendsIterator(profileEmail);
        while (profileIterator.hasNext()) {
            Profile profile = profileIterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
