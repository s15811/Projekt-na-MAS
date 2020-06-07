
import java.io.Serializable;
import java.util.Date;


public abstract class Osoba implements Serializable{
    private static int aktualnyIndex = 10000;
    private int index;
    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private Adres adres; // Atr. złożony

    public Osoba() {
    }
    
    public Osoba(String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.adres = adres;
        setIndex();
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

    public int getIndex() {
        return index;
    }

    public void setIndex() {
        this.index = ++aktualnyIndex;
    }
    
    
    public static class Adres implements Serializable{
        
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