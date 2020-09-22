package structural.bridge.iphone;

public class Iphone11Pro implements Iphone11{
    private String cameraColor;
    private String backColor;
    private String bottomLogo;
    private String logoColor;

    @Override
    public void setCameraColor(String color) {
        this.cameraColor = color;
    }

    @Override
    public String getCameraColor() {
        return this.cameraColor;
    }

    @Override
    public void setBackColor(String color) {
        this.backColor = color;
    }

    @Override
    public String getBackColor() {
        return this.backColor;
    }

    @Override
    public void setBottomLogo(String logo) {
        this.bottomLogo = logo;
    }

    @Override
    public String getBottomLogo() {
        return this.bottomLogo;
    }

    @Override
    public void setLogoColor(String color) {
        this.logoColor = color;
    }

    @Override
    public String getLogoColor() {
        return this.logoColor;
    }

    @Override
    public String toString() {
        return "Iphone11Pro{" +
                "cameraColor='" + cameraColor + '\'' +
                ", backColor='" + backColor + '\'' +
                ", bottomLogo='" + bottomLogo + '\'' +
                ", logoColor='" + logoColor + '\'' +
                '}';
    }
}
