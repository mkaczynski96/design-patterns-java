package creational.abstractfactory.factories;

import creational.abstractfactory.artists.johncoltrane.JohnColtrane;
import creational.abstractfactory.artists.johncoltrane.JohnColtraneAppleMusic;
import creational.abstractfactory.artists.michaeljackson.MichaelJackson;
import creational.abstractfactory.artists.michaeljackson.MichaelJacksonAppleMusic;
import creational.abstractfactory.artists.raesremmurd.RaeSremmurd;
import creational.abstractfactory.artists.raesremmurd.RaeSremmurdAppleMusic;
import creational.abstractfactory.artists.travisscott.TravisScott;
import creational.abstractfactory.artists.travisscott.TravisScottAppleMusic;

public class AppleMusicFactory implements GUIFactory{
    @Override
    public JohnColtrane createJohnColtrane() {
        return new JohnColtraneAppleMusic();
    }

    @Override
    public MichaelJackson createMichaelJackson() {
        return new MichaelJacksonAppleMusic();
    }

    @Override
    public RaeSremmurd createRaeSremmurd() {
        return new RaeSremmurdAppleMusic();
    }

    @Override
    public TravisScott createTravisScott() {
        return new TravisScottAppleMusic();
    }
}
