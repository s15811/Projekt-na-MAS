
package MP03v2;

import java.util.Date;
import java.util.EnumSet;

public class TrenerCwiczacy extends Trener implements IKlient{
    
    private Double rabat;
    private Date dataDolaczenia;
    private EnumSet<RodzajeOsob> typOsoby =  EnumSet.of(RodzajeOsob.Trener, RodzajeOsob.Klient); //Overlapping

    public TrenerCwiczacy(Double rabat, Date dataDolaczenia, int wynagrodzenie, String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
        super(wynagrodzenie, imie, nazwisko, dataUrodzenia, adres);
        this.rabat = rabat;
        this.dataDolaczenia = dataDolaczenia;
    }
    
    public TrenerCwiczacy(Double rabat, Date dataDolaczenia, int wynagrodzenie, Osoba osoba) { //Dynamiczne
        super(wynagrodzenie, osoba.imie, osoba.nazwisko, osoba.dataUrodzenia, osoba.adres);
        this.rabat = rabat;
        this.dataDolaczenia = dataDolaczenia;
    }
    
    public TrenerCwiczacy(int wynagrodzenie, Klient osoba) {
        super(wynagrodzenie, osoba.imie, osoba.nazwisko, osoba.dataUrodzenia, osoba.adres); //Dynamiczne
        this.rabat = osoba.rabat;
        this.dataDolaczenia = osoba.dataDolaczenia;
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
        return "Dane Trenera ćwiczącego u nas: " + "/n/t" + 
                "Imię: " + this.getImie() + "/n/t" + 
                "Nazwisko: " + this.getNazwisko() + "/n/t" + 
                "Adres: " + this.getAdres() + "/n/t" + 
                "Rabat: " + this.getRabat() + "/n/t" + 
                "Wynagrodzenie: " + this.getWynagrodzenie();
    }
}
