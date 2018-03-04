package pl.sternik.mm.kawiarnia.dekoratory;

import pl.sternik.mm.kawiarnia.napoje.Napoj;

public abstract class NapojDekorator implements Napoj {

    private final Napoj napoj;

    public NapojDekorator(Napoj napoj) {
        super();
        this.napoj = napoj;
    }

    public Napoj getNapoj() {
        return napoj;
    }
}