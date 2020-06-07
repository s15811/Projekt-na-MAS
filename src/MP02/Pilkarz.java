
package MP02;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Pilkarz {
    private String imie;
    private String nazwisko;
    private Date dataUrodzenia;
    private ArrayList<PilkarzDruzyna> druzyny; //asocjacja z atrybutem wiele do wiele międzu piłkarzem a drużyną
    private ArrayList<Kontuzja> kontuzje; //kompozycja z kontuzją
    
    private Map<Integer, Nagroda> nagrody = new TreeMap<>(); //asocjacja kwalifikowana 1 do wiele nagrody pilkarza

    public Pilkarz() {
        this.druzyny = new ArrayList<>();
        this.kontuzje = new ArrayList<>();
    }

    public Pilkarz(String imie, String nazwisko, Date dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.druzyny = new ArrayList<>();
        this.kontuzje = new ArrayList<>();
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

    public void dodajKontuzje(Kontuzja kontuzja) throws Exception{
        if(!kontuzje.contains(kontuzja)){
            kontuzje.add(kontuzja);
        }
    }
    public void dodajDruzyne(PilkarzDruzyna druzyna){
        if(druzyny.size() > 0){
            druzyny.get(druzyny.size()-1).setDataOdejscia(new Date());
        }
        druzyny.add(druzyna);
    }
    
    public void dodajNagrode(Nagroda nagroda) throws Exception{
        if(!nagrody.containsKey(nagroda.numer)) {
            nagrody.put(nagroda.numer, nagroda);
            nagroda.setPilkarz(this);
        }
    }
 
    public Nagroda znajdzNagrode(int numerNagrody) throws Exception {
        if(!nagrody.containsKey(numerNagrody)) {
            throw new Exception("Nie można znaleźć nagrody o numerze: " + numerNagrody);
        }
 
        return nagrody.get(numerNagrody);
    }
}
