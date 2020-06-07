
package MP02;

public class Nagroda {

    int numer;
    Pilkarz pilkarz; //asocjacja kwalifikowana 1 do wiele nagrody pilkarza

    public Nagroda(int numer) {
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public Pilkarz getPilkarz() {
        return pilkarz;
    }

    public void setPilkarz(Pilkarz pilkarz) throws Exception{
        if(getPilkarz() == null){
            this.pilkarz = pilkarz;
        }
        else{
            throw new Exception("Nagroda jest już przypisana do jednego piłkarza");
        }
    }
    
    
}
