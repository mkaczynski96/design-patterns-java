package creational.prototype.animals;

import java.util.Objects;

public abstract class Animal {
    private int width;
    private int height;

    public Animal() {
    }

    public Animal(Animal target) {
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public abstract Animal clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return width == animal.width &&
                height == animal.height;
    }
}
