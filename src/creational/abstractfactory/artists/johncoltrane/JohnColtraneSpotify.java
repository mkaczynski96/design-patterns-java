package creational.abstractfactory.artists.johncoltrane;

public class JohnColtraneSpotify implements JohnColtrane {
    @Override
    public void create() {
        System.out.println("You've created John Coltrane new album on Spotify!");
    }
}
