package creational.abstractfactory.artists.michaeljackson;

public class MichaelJacksonSpotify implements MichaelJackson{
    @Override
    public void create() {
        System.out.println("You've created Michael Jackson new album on Spotify!");
    }
}
