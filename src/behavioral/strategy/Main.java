package behavioral.strategy;

import behavioral.strategy.strategies.TakePhotoByCamera;
import behavioral.strategy.strategies.TakePhotoBySmartphone;
import behavioral.strategy.strategies.TakePhotoBySmartwatch;
import behavioral.strategy.strategies.TakePhotoStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Java 8 brought the support of lambda functions, which can serve as simpler alternatives to the Strategy pattern.
public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static TakePhotoStrategy takePhotoStrategy;

    public static void main(String[] args) throws IOException {
        System.out.print("Select how do you want to take a picture:" + "\n" +
                "1 - By Camera" + "\n" +
                "2 - By Smartphone" + "\n" +
                "3 - By Smartwatch\n");
        int choice = Integer.parseInt(reader.readLine());

        switch (choice) {
            case 1 -> takePhotoStrategy = new TakePhotoByCamera();
            case 2 -> takePhotoStrategy = new TakePhotoBySmartphone();
            case 3 -> takePhotoStrategy = new TakePhotoBySmartwatch();
            default -> {
                System.out.println("You didn't pick correct number. Program exited.");
                System.exit(0);
            }
        }

        takePhotoStrategy.takePhoto();
    }

}
