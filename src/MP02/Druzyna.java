
package MP02;

import java.util.ArrayList;

public class Druzyna {
    private String nazwa;
    private ArrayList<Mecz> mecze; //Asocjacja zwykła 1 do wiele z meczem
    private ArrayList<PilkarzDruzyna> pilkarze; //asocjacja z atrybutem wiele do wiele międzu piłkarzem a drużyną

    public Druzyna() {
        this.mecze = new ArrayList<>();
        this.pilkarze = new ArrayList<>();
    }

    public Druzyna(String nazwa, ArrayList<Mecz> mecze) {
        this.nazwa = nazwa;
        this.mecze = new ArrayList<>();
        this.pilkarze = new ArrayList<>();
    }
    
    public void dodajMecz(Mecz mecz){
        mecze.add(mecz);
    }
    
     public void dodajPilkarza(PilkarzDruzyna pilkarz){
        pilkarze.add(pilkarz);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
}
