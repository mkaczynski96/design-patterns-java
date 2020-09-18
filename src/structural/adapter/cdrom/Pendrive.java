package structural.adapter.cdrom;

public class Pendrive {
    private final String memory;

    public Pendrive(String memory) {
        this.memory = memory;
    }

    public String getMemory() {
        return memory;
    }
}
