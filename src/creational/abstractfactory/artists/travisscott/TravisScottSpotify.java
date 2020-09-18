package creational.abstractfactory.artists.travisscott;

public class TravisScottSpotify implements TravisScott {
    @Override
    public void create() {
        System.out.println("You've created Travis Scott new album on Spotify!");
    }
}
