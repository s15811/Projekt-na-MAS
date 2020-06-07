
package MP02;

import java.util.Date;

public abstract class PilkarzDruzyna {
    private Date dataPrzyjscia; //asocjacja z atrybutem wiele do wiele międzu piłkarzem a drużyną
    private Date dataOdejscia; //atrybut opcjinaly
    
    private Druzyna druzyna;
    private Pilkarz pilkarz;

    public PilkarzDruzyna() {
    }

    public PilkarzDruzyna(Druzyna druzyna, Pilkarz pilkarz) {
        this.dataPrzyjscia = new Date();
        this.druzyna = druzyna;
        this.pilkarz = pilkarz;
    }
    
    public PilkarzDruzyna(Date dataPrzyjscia, Druzyna druzyna, Pilkarz pilkarz) {
        this.dataPrzyjscia = dataPrzyjscia;
        this.druzyna = druzyna;
        this.pilkarz = pilkarz;
    }
    
    public PilkarzDruzyna(Date dataPrzyjscia, Date dataOdejscia, Druzyna druzyna, Pilkarz pilkarz) {
        this.dataPrzyjscia = dataPrzyjscia;
        this.dataOdejscia = dataOdejscia;
        this.druzyna = druzyna;
        this.pilkarz = pilkarz;
    }

    public Date getDataPrzyjscia() {
        return dataPrzyjscia;
    }

    public void setDataPrzyjscia(Date dataPrzyjscia) {
        this.dataPrzyjscia = dataPrzyjscia;
    }

    public Date getDataOdejscia() {
        return dataOdejscia;
    }

    public void setDataOdejscia(Date dataOdejscia) {
        this.dataOdejscia = dataOdejscia;
    }

    public Druzyna getDruzyna() {
        return druzyna;
    }

    public void setDruzyna(Druzyna druzyna) {
        this.druzyna = druzyna;
    }

    public Pilkarz getPilkarz() {
        return pilkarz;
    }

    public void setPilkarz(Pilkarz pilkarz) {
        this.pilkarz = pilkarz;
    }
}
