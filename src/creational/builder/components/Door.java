package creational.builder.components;

public class Door {
    private int height;
    private int width;
    private String type;

    public Door(int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Door{" +
                "height=" + height +
                ", width=" + width +
                ", type='" + type + '\'' +
                '}';
    }
}
