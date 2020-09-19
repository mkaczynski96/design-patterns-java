package creational.builder.builders;

import creational.builder.components.*;

public interface Builder {
    void setWall(Wall wall);
    void setRoof(Roof roof);
    void setFloor(Floor floor);
    void setDoor(Door door);
    void setWindow(Window window);
}
