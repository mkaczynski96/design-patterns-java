package structural.adapter.adapters;

import structural.adapter.shirt.CompactDisc;
import structural.adapter.shirt.Pendrive;

public class PendriveAdapter extends CompactDisc {
    private Pendrive pendrive;

    public PendriveAdapter(Pendrive pendrive) {
        this.pendrive = pendrive;
    }

    @Override
    public String getType() {
        System.out.println("Pendrive applied to cdr-pendrive-adapter!");
        return "CD-R";
    }
}
