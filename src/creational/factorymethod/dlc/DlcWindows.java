package creational.factorymethod.dlc;

public class DlcWindows implements Dlc{
    @Override
    public void render() {
        addGun();
        addMap();
        addTank();
        System.out.println("DLC for Windows");
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
