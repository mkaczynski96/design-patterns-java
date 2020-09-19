package creational.builder.components;

public class Floor {
    private String type;

    public Floor(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "type='" + type + '\'' +
                '}';
    }
}
