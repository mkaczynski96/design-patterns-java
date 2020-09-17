package creational.abstractfactory.factories;

import creational.abstractfactory.artists.johncoltrane.JohnColtrane;
import creational.abstractfactory.artists.johncoltrane.JohnColtraneSpotify;
import creational.abstractfactory.artists.michaeljackson.MichaelJackson;
import creational.abstractfactory.artists.michaeljackson.MichaelJacksonSpotify;
import creational.abstractfactory.artists.raesremmurd.RaeSremmurd;
import creational.abstractfactory.artists.raesremmurd.RaeSremmurdSpotify;
import creational.abstractfactory.artists.travisscott.TravisScott;
import creational.abstractfactory.artists.travisscott.TravisScottSpotify;

public class SpotifyFactory implements GUIFactory{
    @Override
    public JohnColtrane createJohnColtrane() {
        return new JohnColtraneSpotify();
    }

    @Override
    public MichaelJackson createMichaelJackson() {
        return new MichaelJacksonSpotify();
    }

    @Override
    public RaeSremmurd createRaeSremmurd() {
        return new RaeSremmurdSpotify();
    }

    @Override
    public TravisScott createTravisScott() {
        return new TravisScottSpotify();
    }
}
