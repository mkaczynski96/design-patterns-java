package creational.builder;

import creational.builder.builders.HouseBuilder;
import creational.builder.director.Director;
import creational.builder.houses.House;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();

        director.constructRichHouse(houseBuilder);

        House house = houseBuilder.getResult();
        System.out.println("House built: "+ house.toString());
    }
}
