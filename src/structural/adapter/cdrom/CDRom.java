package structural.adapter.cdrom;

public class CDRom {
    private String type;

    public CDRom(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public boolean fits(CompactDisc compactDisc) {
        boolean result;
        result = (this.type.equals(compactDisc.getType()));
        return result;
    }
}
