package creational.factorymethod.factory;

import creational.factorymethod.dlc.Dlc;
import creational.factorymethod.dlc.DlcPlaystation;

public class GamePlaystation extends Game{
    @Override
    public Dlc addDlc() {
        return new DlcPlaystation();
    }
}
