
package MP02;

import java.util.Date;

public class Kontuzja {
    private String nazwaKontuzji;
    private Date dataUrazu;
    private Date dataWyleczenia;
    private Pilkarz pilkarz;


    public Kontuzja(String nazwaKontuzji, Date dataUrazu, Pilkarz pilkarz) {
        this.nazwaKontuzji = nazwaKontuzji;
        this.dataUrazu = dataUrazu;
        this.pilkarz = pilkarz;
    }
    
    public Kontuzja(String nazwaKontuzji, Date dataUrazu, Date dataWyleczenia, Pilkarz pilkarz) {
        this.nazwaKontuzji = nazwaKontuzji;
        this.dataUrazu = dataUrazu;
        this.dataWyleczenia = dataWyleczenia;
        this.pilkarz = pilkarz;
    }
    
    public static Kontuzja dodajKontuzje(Pilkarz pilkarz, String nazwa, Date date) throws Exception{
        if(pilkarz == null){
            throw new Exception("Kontuzja nie może istnieć bez piłkarza");
        }
        
        Kontuzja kontuzja = new Kontuzja(nazwa, date, pilkarz);
        
        pilkarz.dodajKontuzje(kontuzja);
        
        return kontuzja;
    }

    public String getNazwaKontuzji() {
        return nazwaKontuzji;
    }

    public void setNazwaKontuzji(String nazwaKontuzji) {
        this.nazwaKontuzji = nazwaKontuzji;
    }

    public Date getDataUrazu() {
        return dataUrazu;
    }

    public void setDataUrazu(Date dataUrazu) {
        this.dataUrazu = dataUrazu;
    }

    public Date getDataWyleczenia() {
        return dataWyleczenia;
    }

    public void setDataWyleczenia(Date dataWyleczenia) {
        this.dataWyleczenia = dataWyleczenia;
    }

    public Pilkarz getPilkarz() {
        return pilkarz;
    }
    
}
