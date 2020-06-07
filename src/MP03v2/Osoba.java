package MP03v2;



import java.util.Date;
import java.util.EnumSet;

enum RodzajeOsob {Osoba, Klient, Trener};

public abstract class Osoba{
    protected String imie;
    protected String nazwisko;
    protected Date dataUrodzenia;
    protected Adres adres;
    private EnumSet<RodzajeOsob> typOsoby =  EnumSet.of(RodzajeOsob.Osoba); //Overlapping

    public Osoba() {
    }
    
    public Osoba(String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.adres = adres;
    }
    
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getAdres() {
        return adres.toString();
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    
    public String wyswietDane(){
        return "Dane Osoby: " + "/n/t" + 
                "Imię: " + this.getImie() + "/n/t" + 
                "Nazwisko: " + this.getNazwisko() + "/n/t" + 
                "Adres: " + this.getAdres();
    }

    public static class Adres{
        
        String miasto;
        String ulica;
        String kodPocztowy;
        int nrBudynku;
        int nrMieszkania;
        
        
        public Adres(String miasto, String ulica, String kodPocztowy, int nrBudynku, int nrMieszkania) {
            this.kodPocztowy = kodPocztowy;
            this.miasto = miasto;
            this.ulica = ulica;
            this.nrBudynku = nrBudynku;
            this.nrMieszkania = nrMieszkania;
        }
         
        //przysłonięcie
        @Override
        public String toString() {
            return kodPocztowy + " " + miasto + " " + ulica + " " + nrBudynku + "/" + nrMieszkania;
        }
        
        
    }
    

}
