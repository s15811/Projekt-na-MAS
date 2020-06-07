
package MP02;

import java.util.Date;

public class Mecz {
    private String wynik;
    private Date dataMeczu;
    private Druzyna gospodarz; //Asocjacja zwykła 1 do wiele z druzyna
    private Druzyna gosc; //Asocjacja zwykła 1 do wiele z druzyna
    
    public Mecz(){
    }

    public Mecz(String wynik, Date dataMeczu, Druzyna gospodarz, Druzyna gosc) {
        this.wynik = wynik;
        this.dataMeczu = dataMeczu;
        this.gospodarz = gospodarz;
        this.gosc = gosc;
        
        this.gospodarz.dodajMecz(this);
        this.gosc.dodajMecz(this);
    }

    public String getWynik() {
        return wynik;
    }

    public void setWynik(String wynik) {
        this.wynik = wynik;
    }

    public Date getDataMeczu() {
        return dataMeczu;
    }

    public void setDataMeczu(Date dataMeczu) {
        this.dataMeczu = dataMeczu;
    }

    public Druzyna getGospodarz() {
        return gospodarz;
    }

    public void setGospodarz(Druzyna gospodarz) {
        this.gospodarz = gospodarz;
        this.gospodarz.dodajMecz(this);
    }

    public Druzyna getGosc() {
        return gosc;
    }

    public void setGosc(Druzyna gosc) {
        this.gosc = gosc;
        this.gosc.dodajMecz(this);
    }
    
    
}
