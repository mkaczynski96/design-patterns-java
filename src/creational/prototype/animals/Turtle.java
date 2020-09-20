package creational.prototype.animals;

import java.util.Objects;

public class Turtle extends Animal{
    public String shell;
    public String lungsCapacity;

    public Turtle() {
    }

    public Turtle(Turtle target) {
        if (target != null) {
            this.shell = target.shell;
            this.lungsCapacity = target.lungsCapacity;
        }
    }

    @Override
    public Animal clone() {
        return new Turtle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Turtle turtle = (Turtle) o;
        return Objects.equals(shell, turtle.shell) &&
                Objects.equals(lungsCapacity, turtle.lungsCapacity);
    }
}
