package behavioral.strategy.strategies;

public class Photo {
    int height;
    int width;
    int pixelsX;
    int pixelsY;

    public Photo(int height, int width, int pixelsX, int pixelsY) {
        this.height = height;
        this.width = width;
        this.pixelsX = pixelsX;
        this.pixelsY = pixelsY;
        System.out.println("Picture taken details: ");
        System.out.println(toString());
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "height=" + height +
                ", width=" + width +
                ", pixelsX=" + pixelsX +
                ", pixelsY=" + pixelsY +
                '}';
    }
}
