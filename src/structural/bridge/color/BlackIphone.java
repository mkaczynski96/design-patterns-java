package structural.bridge.color;

import structural.bridge.iphone.Iphone11;

public class BlackIphone implements IphoneColor{
    protected Iphone11 iphone11;

    public BlackIphone() {
    }

    public BlackIphone(Iphone11 iphone11) {
        this.iphone11 = iphone11;
    }

    @Override
    public void applyColor() {
        iphone11.setBackColor("BLACK");
        iphone11.setBottomLogo(null);
        iphone11.setCameraColor("BLACK");
        iphone11.setLogoColor("SILVER");
        System.out.println(iphone11.toString());
    }
}
