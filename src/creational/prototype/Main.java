package creational.prototype;

import creational.prototype.animals.Animal;
import creational.prototype.animals.Cat;
import creational.prototype.animals.Turtle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<Animal> copyAnimalList = new ArrayList<>();

        Cat cat = new Cat();
        cat.hair = "black";
        animalList.add(cat);

        Cat anotherCat = (Cat) cat.clone();
        animalList.add(anotherCat);

        Turtle turtle = new Turtle();
        turtle.lungsCapacity = "100m^3";
        turtle.shell = "strong";

        animalList.add(turtle);

        cloneAndCompare(animalList, copyAnimalList);
    }

    private static void cloneAndCompare(List<Animal> animals, List<Animal> animalsCopy) {
        for (Animal animal : animals) {
            animalsCopy.add(animal.clone());
        }

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) != animalsCopy.get(i)) {
                System.out.println(i + ": Animals are different objects (yay!)");
                if (animals.get(i).equals(animalsCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
