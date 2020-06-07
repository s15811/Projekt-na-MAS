
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Klient extends Osoba implements Serializable{
    private static List<Klient> klienci = new ArrayList<>(); //Ekstensja
    private static final double maksymalnyRabat = 0.10;
    private Double rabat; //Atr. opcjonalny
    private Date dataDolaczenia;

    public Klient() {
        super();
        klienci.add(this);
    }
    
    public Klient(String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
       super(imie, nazwisko, dataUrodzenia, adres);
       klienci.add(this);
    }

    public Date getDataDolaczenia() {
        return dataDolaczenia;
    }

    public void setDataDolaczenia(Date dataDolaczenia) {
        this.dataDolaczenia = dataDolaczenia;
    }

    public Double getRabat() { //zwraca ma null jak puste
        return rabat;
    }

    public void setRabat(Double rabat) {
        this.rabat = rabat;
    }
    //Ekstensja trwałość
    public static void writeExtent(ObjectOutputStream stream) throws IOException {
        stream.writeObject(klienci);
    }
 
    public static void readExtent(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        klienci = (ArrayList<Klient>) stream.readObject();
    }
    
    public static void wyswietlKlientow(){
        naliczRabat();
        System.out.println("Lista wszystkich klientów:");
        for (Klient k : klienci){
//            try{
//                System.out.println(k.getImie() + " " + k.getNazwisko() + " ma rabat w wysokości " +k.getRabat()*100 + "%");
//            }
//            catch(Exception e){
//                 System.out.println(k.getImie() + " " + k.getNazwisko() + " ma rabat w wysokości 0%");
//            }
            if (k.getRabat() != null){
                System.out.println(k.getImie() + " " + k.getNazwisko() + " ma rabat w wysokości " +k.getRabat()*100 + "%");
            }
            else{
                System.out.println(k.getImie() + " " + k.getNazwisko() + " ma rabat w wysokości 0%");
            }
        }
        System.out.println("");
    }
    
    public static void naliczRabat(){ //metoda klasowa
        for (Klient k : klienci){
            if((long)(new Date().getTime() - k.getDataDolaczenia().getTime()) > 31536000000l){
                k.setRabat(maksymalnyRabat);
            }
        }
        System.out.println("");
    }
    
    public static void usunKlienta(Klient klient){
        for (int i = 0; i < klienci.size(); i++){
//            if(klienci.get(i).getImie().equals(klient.getImie()) && 
//                klienci.get(i).getNazwisko().equals(klient.getNazwisko()) &&
//                klienci.get(i).getDataUrodzenia().equals(klient.getDataUrodzenia())){
            if(klienci.get(i).getIndex() == klient.getIndex()){
                    Trener.usunKlienta(klient);
                    klienci.remove(i);
                    System.out.println("Pomyślnie usunięto klienta");
            }
        }
    }
}
