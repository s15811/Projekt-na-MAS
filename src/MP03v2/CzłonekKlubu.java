
package MP03v2;

import java.util.Date;


public class CzłonekKlubu extends Osoba{ //Wieloaspektowe
    private long numerIdentyfikacyjny;

    public CzłonekKlubu(long numerIdentyfikacyjny, String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
        super(imie, nazwisko, dataUrodzenia, adres);
        this.numerIdentyfikacyjny = numerIdentyfikacyjny;
    }
    
    public CzłonekKlubu(long numerIdentyfikacyjny, Osoba osoba) {
        super(osoba.imie, osoba.nazwisko, osoba.dataUrodzenia, osoba.adres);
        this.numerIdentyfikacyjny = numerIdentyfikacyjny;
    }
}
