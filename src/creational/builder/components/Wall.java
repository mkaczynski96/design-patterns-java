package creational.builder.components;

public class Wall {
    private int height;
    private int width;
    private String color;

    public Wall(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
