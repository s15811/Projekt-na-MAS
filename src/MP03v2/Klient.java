package MP03v2;

import java.util.Date;
import java.util.EnumSet;


public class Klient extends Osoba implements IKlient{ //Wielodziedziczenie
    private static final double maksymalnyRabat = 0.10;
    protected Double rabat; //Atr. opcjonalny
    protected Date dataDolaczenia;
    private EnumSet<RodzajeOsob> typOsoby =  EnumSet.of(RodzajeOsob.Klient); //Overlapping

    public Klient() {
        super();
    }
    
    public Klient(String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
       super(imie, nazwisko, dataUrodzenia, adres);
    }

    public Klient(Double rabat, Date dataDolaczenia, String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
        super(imie, nazwisko, dataUrodzenia, adres);
        this.rabat = rabat;
        this.dataDolaczenia = dataDolaczenia;
    }
    
    public Klient(Double rabat, Date dataDolaczenia, Osoba osoba) { //Dynamiczne
        super(osoba.imie, osoba.nazwisko, osoba.dataUrodzenia, osoba.adres);
        this.rabat = rabat;
        this.dataDolaczenia = dataDolaczenia;
    }

    @Override
    public Double getRabat() {
        return rabat;
    }

    @Override
    public Date getDataDolaczenia() {
        return dataDolaczenia;
    }

    @Override
    public String wyswietDane() {
        return "Dane Klienta: " + "/n/t" + 
                "Imię: " + this.getImie() + "/n/t" + 
                "Nazwisko: " + this.getNazwisko() + "/n/t" + 
                "Adres: " + this.getAdres() + "/n/t" + 
                "Rabat: " + this.getRabat();
    }
    
    
}
