package structural.bridge;

import structural.bridge.color.BlackIphone;
import structural.bridge.color.RedIphone;
import structural.bridge.iphone.Iphone11;
import structural.bridge.iphone.Iphone11Pro;
import structural.bridge.iphone.Iphone11Standard;

public class Main {
    public static void main(String[] args) {
        createNewIphone(new Iphone11Standard());
        createNewIphone(new Iphone11Pro());
    }

    public static void createNewIphone(Iphone11 iphone11) {
        System.out.println("Creating new iphone with 2 colors available...");
        BlackIphone blackIphone = new BlackIphone(iphone11);
        blackIphone.applyColor();

        RedIphone redIphone = new RedIphone(iphone11);
        redIphone.applyColor();

        System.out.println();
    }
}