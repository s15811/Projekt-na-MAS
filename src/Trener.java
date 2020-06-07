
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Trener extends Osoba implements Serializable{
    private static List<Trener> trenerzy = new ArrayList<>(); //Ekstensja
    private static final int minimalneWynagrodzenie = 2500; //Atr. klasowy
    private int wynagrodzenie;
    private static final double procentOdKlienta = 0.05;
    private Double premia; //Atr. pochodny
    private List<Klient> klienci; //Atr. powtarzalny miał byś wyszła assercja

    public Trener() {
        super();
        klienci = new ArrayList<>();
        trenerzy.add(this);
    }
    
    public Trener(String imie, String nazwisko, Date dataUrodzenia, Adres adres) {
       super(imie, nazwisko, dataUrodzenia, adres);
       klienci = new ArrayList<>();
       trenerzy.add(this);
    }
    
    
    private int getWynagrodzenie() {
        return wynagrodzenie;
    }
    
    public void setWynagrodzenie(int wynagrodzenie) {
        if(this.wynagrodzenie > wynagrodzenie){
            System.out.println("Wynagrodzenie nie może zostać zmniejszone");
        }
        else if(wynagrodzenie < minimalneWynagrodzenie){
            System.out.println("Wynagrodzenie nie może być mniejsze od minimalnego wynagrodzenia. Ustowiono dla Trenera " + this.getImie() + " " +
                    this.getNazwisko() + " wynagrodzenie równe minimalnemu");
            this.wynagrodzenie = minimalneWynagrodzenie;
        }
        else{
            this.wynagrodzenie = wynagrodzenie;
        }
    }

//    public static void setWynagrodzenie(int index, int wynagrodzenie) {
//        for(Trener t : trenerzy){
//            if (t.getIndex() == index) {
//                if(t.wynagrodzenie > wynagrodzenie){
//                    System.out.println("Wynagrodzenie nie może zostać zmniejszone");
//                }
//                else if(wynagrodzenie < minimalneWynagrodzenie){
//                    System.out.println("Wynagrodzenie nie może być mniejsze od minimalnego wynagrodzenia. Ustowiono dla Trenera " + t.getImie() + " " +
//                            t.getNazwisko() + " wynagrodzenie równe minimalnemu");
//                    t.wynagrodzenie = minimalneWynagrodzenie;
//                }
//                else{
//                    t.wynagrodzenie = wynagrodzenie;
//                }
//            }
//        }
//    }
    
    public void dodajKlienta(Klient klient){
        this.klienci.add(klient);
    }

//    public static void dodajKlienta(int index, Klient klient){
//        for(Trener t : trenerzy){
//            if (t.getIndex() == index) {
//                t.klienci.add(klient);
//            }
//        }
//    }
    
    public void dodajKlienta(Klient... klient){
        this.klienci.addAll(Arrays.asList(klient));
    }
    
//    public static void dodajKlienta(int index, Klient... klient){
//        for(Trener t : trenerzy){
//            if (t.getIndex() == index) {
//                t.klienci.addAll(Arrays.asList(klient));
//            }
//        }
//    }

    public Double getPremia() {
        return premia;
    }

    private void setPremia() {
        if(klienci.isEmpty()){
            this.premia = null;
        }
        else{
            this.premia = wynagrodzenie * procentOdKlienta * klienci.size();
        }    
    }
    //Ekstensja trwałość
    public static void writeExtent(ObjectOutputStream stream) throws IOException {
        stream.writeObject(trenerzy);
    }
 
    public static void readExtent(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        trenerzy = (ArrayList<Trener>) stream.readObject();
    }
    
    private void wyswietlKlientow(){
        if(klienci.isEmpty()){
            System.out.println("Nie posiada klientów");
            System.out.println("");
        }
        else{
            System.out.println("Lista klientów: ");
            klienci.forEach((klient) -> {
                System.out.println(klient.getImie() + " " + klient.getNazwisko());
            });
            System.out.println("");
        }
    }
    
    public static void wyswietlKlientowKazdegoTrenera(){
        for (Trener t : trenerzy){
            System.out.println("Trener " + t.getImie() + " " + t.getNazwisko());
            t.wyswietlKlientow();
        }
    }
    
    public static void naliczPremie(){ //metoda klasowa
        for (Trener t : trenerzy){
            System.out.print("Dla trenera " + t.getImie() + " " + t.getNazwisko());
            t.setPremia();
            try{
                System.out.print(" naliczono " + t.getPremia() + " premii");
            }
            catch(Exception e){
                 System.out.print("nie naliczono premii");
            }
//            if (t.getPremia() == 0){
//                System.out.print(" nie naliczono premii");
//            }
//            else{
//                System.out.print(" naliczono " + t.getPremia() + " premii");
//            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    static void usunKlienta(Klient klient) {
        for (Trener t : trenerzy){
            for (int i = 0; i < t.klienci.size(); i++){
                if(t.klienci.get(i).getIndex() == klient.getIndex()){
                    t.klienci.remove(i);
                }
            }
        }
    }
}
