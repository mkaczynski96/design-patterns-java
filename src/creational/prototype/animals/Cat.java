package creational.prototype.animals;

import java.util.Objects;

public class Cat extends Animal {
    public String hair;

    public Cat() {
    }

    public Cat(Cat target) {
        if (target != null) {
            this.hair = target.hair;
        }
    }

    @Override
    public Animal clone() {
        return new Cat(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(hair, cat.hair);
    }
}
