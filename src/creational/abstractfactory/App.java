package creational.abstractfactory;

import creational.abstractfactory.artists.johncoltrane.JohnColtrane;
import creational.abstractfactory.artists.michaeljackson.MichaelJackson;
import creational.abstractfactory.artists.raesremmurd.RaeSremmurd;
import creational.abstractfactory.artists.travisscott.TravisScott;
import creational.abstractfactory.factories.GUIFactory;

public class App {
    private JohnColtrane johnColtrane;
    private MichaelJackson michaelJackson;
    private RaeSremmurd raeSremmurd;
    private TravisScott travisScott;

    public App(GUIFactory factory) {
        johnColtrane = factory.createJohnColtrane();
        michaelJackson = factory.createMichaelJackson();
        raeSremmurd = factory.createRaeSremmurd();
        travisScott = factory.createTravisScott();
    }

    public void play(){
        johnColtrane.create();
        michaelJackson.create();
        raeSremmurd.create();
        travisScott.create();
    }
}
