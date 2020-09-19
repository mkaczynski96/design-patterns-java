package creational.builder.builders;

import creational.builder.components.*;
import creational.builder.houses.House;

public class HouseBuilder implements Builder{
    private Door door;
    private Floor floor;
    private Roof roof;
    private Wall wall;
    private Window window;

    public House getResult(){
        return new House(door,floor,roof,wall,window);
    }


    @Override
    public void setWall(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void setWindow(Window window) {
        this.window = window;
    }
}
