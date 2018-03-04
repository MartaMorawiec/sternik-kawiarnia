package pl.sternik.mm.kawiarnia.dekoratory;

import pl.sternik.mm.kawiarnia.napoje.Napoj;

public class BitaSmietana extends NapojDekorator {
    private static final double CENA_DODATKU = 2.00;
    private static final String OPIS_DODATKU = " z bitą śmieraną";

    public BitaSmietana(Napoj napoj) {
        super(napoj);
        System.out.println("Dodaję bitą śmietanę  (cena " + CENA_DODATKU + " zł)");
    }

    public String getNazwa() {
        return getNapoj().getNazwa() + OPIS_DODATKU;
    }

    public double getCena() {
        return getNapoj().getCena() + CENA_DODATKU;
    }
    @Override
    public String toString() {
        return "ML [nazwa() = " + getNazwa() + ", cena = " + getCena() + "]";
    }
}