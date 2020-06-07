package MP03v2;


import java.util.Date;
import java.util.EnumSet;


public class Trener extends Osoba{
    private int wynagrodzenie;
    private EnumSet<RodzajeOsob> typOsoby =  EnumSet.of(RodzajeOsob.Trener); //Overlapping

    public Trener() {
        super();
    }
    
    public Trener(String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
       super(imie, nazwisko, dataUrodzenia, adres);
    }

    public Trener(int wynagrodzenie, String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
        super(imie, nazwisko, dataUrodzenia, adres);
        this.wynagrodzenie = wynagrodzenie;
    }
    
    public Trener(int wynagrodzenie, Osoba osoba) { //Dynamiczne
        super(osoba.imie, osoba.nazwisko, osoba.dataUrodzenia, osoba.adres);
        this.wynagrodzenie = wynagrodzenie;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    @Override
    public String wyswietDane() {
        return "Dane Trenera: " + "/n/t" + 
                "Imię: " + this.getImie() + "/n/t" + 
                "Nazwisko: " + this.getNazwisko() + "/n/t" + 
                "Adres: " + this.getAdres() + "/n/t" + 
                "Wynagrodzenie: " + this.getWynagrodzenie();
    }
    
    
   
}
