package structural.bridge.color;

import structural.bridge.iphone.Iphone11;

public class RedIphone implements IphoneColor{
    protected Iphone11 iphone11;

    public RedIphone() {
    }

    public RedIphone(Iphone11 iphone11) {
        this.iphone11 = iphone11;
    }

    @Override
    public void applyColor() {
        iphone11.setBackColor("RED");
        iphone11.setBottomLogo("( RED )^TM");
        iphone11.setCameraColor("RED");
        iphone11.setLogoColor("SILVER");
        System.out.println(iphone11.toString());
    }
}
