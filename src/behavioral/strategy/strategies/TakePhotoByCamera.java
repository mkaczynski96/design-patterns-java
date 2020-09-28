package behavioral.strategy.strategies;

public class TakePhotoByCamera implements TakePhotoStrategy {
    private boolean lens;
    private boolean lensCap;


    public TakePhotoByCamera() {
        this.lens = true;
        this.lensCap = true;
    }

    @Override
    public Photo takePhoto() {
        if (lens && lensCap) {
            System.out.println("Taking photo by camera...");
            return new Photo(300, 550, 1080, 1920);
        }
        return null;
    }
}
