package behavioral.strategy.strategies;

public class TakePhotoBySmartwatch implements TakePhotoStrategy {
    private boolean isSmartphoneAvailable;

    public TakePhotoBySmartwatch() {
        this.isSmartphoneAvailable = true;
    }

    @Override
    public Photo takePhoto() {
        if (isSmartphoneAvailable) {
            System.out.println("Taking photo by smartwatch...");
            return new Photo(300, 550, 600, 800);
        }
        return null;
    }
}
