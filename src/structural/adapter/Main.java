package structural.adapter;

import structural.adapter.adapters.PendriveAdapter;
import structural.adapter.cdrom.CDRom;
import structural.adapter.cdrom.CompactDisc;
import structural.adapter.cdrom.Pendrive;

public class Main {
    public static void main(String[] args) {
        CDRom cdRom = new CDRom("CD-R");
        CompactDisc compactDisc = new CompactDisc("CD-R");
        if (cdRom.fits(compactDisc)) {
            System.out.println("Compact disc with CD-R type fits to CDRom");
        }

        Pendrive pendrive = new Pendrive("Flash");
        PendriveAdapter pendriveAdapter = new PendriveAdapter(pendrive);
        if (cdRom.fits(pendriveAdapter)) {
            System.out.println("Pendrive connected to CDRom");
        }
    }
}
