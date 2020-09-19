package creational.builder.houses;

import creational.builder.components.*;

public class House {
    private Door door;
    private Floor floor;
    private Roof roof;
    private Wall wall;
    private Window window;

    public House(Door door, Floor floor, Roof roof, Wall wall, Window window) {
        this.door = door;
        this.floor = floor;
        this.roof = roof;
        this.wall = wall;
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public Floor getFloor() {
        return floor;
    }

    public Roof getRoof() {
        return roof;
    }

    public Wall getWall() {
        return wall;
    }

    public Window getWindow() {
        return window;
    }

    @Override
    public String toString() {
        return "House{" +
                "door=" + getDoor() +
                ", floor=" + getFloor() +
                ", roof=" + getRoof() +
                ", wall=" + getWall() +
                ", window=" + getWindow() +
                '}';
    }
}
