package creational.builder.components;

public class Window {
    private final int height;
    private final int width;

    public Window(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Window{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
