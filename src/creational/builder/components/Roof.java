package creational.builder.components;

public class Roof {
    private int squareMeters;
    private String color;

    public Roof(int squareMeters, String color) {
        this.squareMeters = squareMeters;
        this.color = color;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Roof{" +
                "squareMeters=" + squareMeters +
                ", color='" + color + '\'' +
                '}';
    }
}
