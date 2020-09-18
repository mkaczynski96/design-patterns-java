package creational.factorymethod.factory;

import creational.factorymethod.dlc.Dlc;

public abstract class Game {

    public void renderGame() {
        Dlc dlc = addDlc();
        dlc.render();
    }

    public abstract Dlc addDlc();
}
