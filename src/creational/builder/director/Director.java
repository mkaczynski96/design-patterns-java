package creational.builder.director;

import creational.builder.builders.Builder;
import creational.builder.components.*;

public class Director {
    public void constructRichHouse(Builder builder){
        builder.setDoor(new Door(2,2,"Wood"));
        builder.setFloor(new Floor("Wood"));
        builder.setRoof(new Roof(50, "Brown"));
        builder.setWall(new Wall(3,5,"White"));
        builder.setWindow(new Window(1, 2));
    }

    public void constructPoorHouse(Builder builder){
        builder.setDoor(new Door(1,1,"Plywood"));
        builder.setFloor(new Floor("Plywood"));
        builder.setRoof(new Roof(10, "Rust"));
        builder.setWall(new Wall(1,2,"Mold"));
        builder.setWindow(new Window(1, 1));
    }
}
