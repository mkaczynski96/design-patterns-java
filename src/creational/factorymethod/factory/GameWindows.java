package creational.factorymethod.factory;

import creational.factorymethod.dlc.Dlc;
import creational.factorymethod.dlc.DlcWindows;

public class GameWindows extends Game{
    @Override
    public Dlc addDlc() {
        return new DlcWindows();
    }
}
