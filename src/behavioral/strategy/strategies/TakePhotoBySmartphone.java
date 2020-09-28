package behavioral.strategy.strategies;

public class TakePhotoBySmartphone implements TakePhotoStrategy {
    private boolean unlocked;

    public TakePhotoBySmartphone() {
        this.unlocked = true;
    }

    @Override
    public Photo takePhoto() {
        if (unlocked) {
            System.out.println("Taking photo by smartphone...");
            return new Photo(300, 550, 3840, 2160);
        }
        return null;
    }
}
