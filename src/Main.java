
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main implements Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Klient adam = new Klient("Adam", "Adam", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1996"), new Osoba.Adres("Warszawa", "Tumska", "02-430", 19, 0));
        Klient artur = new Klient("Artur", "Artur", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1996"), new Osoba.Adres("Warszawa", "Tumska", "02-430", 19, 0));
        Klient tomek = new Klient("Tomek", "Tomek", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1996"), new Osoba.Adres("Warszawa", "Tumska", "02-430", 19, 0));
        Klient maciej = new Klient("Maciej", "Maciej", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1996"), new Osoba.Adres("Warszawa", "Tumska", "02-430", 19, 0));
        
        Trener piotr = new Trener("Piotr", "Piotr", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1996"), new Osoba.Adres("Warszawa", "Tumska", "02-430", 19, 0));
        Trener pawel = new Trener("Paweł", "Paweł", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1996"), new Osoba.Adres("Warszawa", "Tumska", "02-430", 19, 0));
        Trener damian = new Trener("Damian", "Damian", new SimpleDateFormat("dd/MM/yyyy").parse("20/05/1996"), new Osoba.Adres("Warszawa", "Tumska", "02-430", 19, 0));
        
        adam.setDataDolaczenia(new Date(120,2,17));
        artur.setDataDolaczenia(new Date(118,11,11));
        tomek.setDataDolaczenia(new Date(119,4,22));
        System.out.println(tomek.getDataDolaczenia());
        maciej.setDataDolaczenia(new Date());
        
        piotr.setWynagrodzenie(1333);
        piotr.dodajKlienta(artur, tomek);
        
        pawel.setWynagrodzenie(5500);
        pawel.dodajKlienta(adam);
        
        damian.setWynagrodzenie(2500);
        
        Trener.naliczPremie();
        Trener.wyswietlKlientowKazdegoTrenera();
        Klient.wyswietlKlientow();
        
        
        Trener.wyswietlKlientowKazdegoTrenera();
        Trener.naliczPremie();
        Klient.usunKlienta(artur);
        Klient.wyswietlKlientow();
        
        Trener.wyswietlKlientowKazdegoTrenera();
        
        
        //Ekstensja trwałość
        final String extentFile = "mas-extent.ser";
        
        try {
            
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(extentFile));
            Klient.writeExtent(out);
            Trener.writeExtent(out);
            out.close();

            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(extentFile));
            Klient.readExtent(in);
            Trener.readExtent(in);
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        // koniec 
    }

}
