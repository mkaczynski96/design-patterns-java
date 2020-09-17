package creational.abstractfactory;

// Use the Abstract Factory when your code needs to work with various families of related products,
// but you don’t want it to depend on the concrete classes of those products—they might be unknown beforehand
// or you simply want to allow for future extensibility.
//
// The Abstract Factory provides you with an interface for creating objects from each class of the product family.
// As long as your code creates objects via this interface,
// you don’t have to worry about creating the wrong variant of a product
// which doesn’t match the products already created by your app.

import creational.abstractfactory.factories.AppleMusicFactory;
import creational.abstractfactory.factories.GUIFactory;
import creational.abstractfactory.factories.SpotifyFactory;

import java.util.Random;

// This pattern presents sharing new albums, from directory of the record company, on the streaming platform
// depends on which platform wins auction for albums release
//
// There are four artists who releasing new albums
// Also, there are two bidders/streaming platforms: Apple Music and Spotify
public class Main {
    static String appleMusic = "Apple Music";
    static String spotify = "Spotify";

    public static void main(String[] args) {
        App app = configureApp();
        app.play();
    }

    private static App configureApp() {
        App app;
        GUIFactory guiFactory;
        String sponsor = randSponsor();

        if (sponsor.equals(appleMusic)) {
            guiFactory = new AppleMusicFactory();
        } else {
            guiFactory = new SpotifyFactory();
        }
        app = new App(guiFactory);

        return app;
    }

    // It draws a sponsor
    private static String randSponsor(){
        Random random = new Random();
        int randInt = random.nextInt(2);
        if (randInt == 1) {
            return appleMusic;
        }
        return spotify;
    }
}