package creational.abstractfactory.factories;

import creational.abstractfactory.artists.johncoltrane.JohnColtrane;
import creational.abstractfactory.artists.michaeljackson.MichaelJackson;
import creational.abstractfactory.artists.raesremmurd.RaeSremmurd;
import creational.abstractfactory.artists.travisscott.TravisScott;

public interface GUIFactory {
    JohnColtrane createJohnColtrane();
    MichaelJackson createMichaelJackson();
    RaeSremmurd createRaeSremmurd();
    TravisScott createTravisScott();
}
