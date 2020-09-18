package creational.factorymethod.dlc;

public class DlcPlaystation implements Dlc{
    @Override
    public void render() {
        addMap();
        addGun();
        addTank();
        System.out.println("DLC for Playstation");
    }

    @Override
    public void addMap() {
        System.out.println("Added new map!");
    }

    @Override
    public void addGun() {
        System.out.println("Added new gun!");
    }

    @Override
    public void addTank() {
        System.out.println("Added new tank!");
    }
}
