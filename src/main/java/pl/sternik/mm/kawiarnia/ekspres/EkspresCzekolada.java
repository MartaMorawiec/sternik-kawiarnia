package pl.sternik.mm.kawiarnia.ekspres;

import pl.sternik.mm.kawiarnia.dekoratory.BitaSmietana;
import pl.sternik.mm.kawiarnia.napoje.Czekolada;
import pl.sternik.mm.kawiarnia.napoje.Napoj;

public class EkspresCzekolada extends Ekspres {
    private final Napoj k = new Czekolada();

    @Override
    protected Napoj zrobNapoj() {
        System.out.println("Robię napój - Czekolada  (cena " + k.getCena() + " zł)");
        return k;
    }

    @Override
    protected void nalejDoPojemnika() {
        System.out.println("Nalewam do filiżanki");
    }

    @Override
    protected void ugotujPlyn() {
        System.out.println("Rozpuszczam czekoladę...");
    }

    @Override
    protected Napoj dodajDodatki(Napoj napoj) {
        return new BitaSmietana(napoj);
    }
}