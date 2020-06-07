
package MP03;

public class Rycerz extends JednostkaZblizeniowa implements RasaCzlowiek{

    int defensywa;
    
    String rasa;
    
    public Rycerz(int obrażenia, String nazwa, int zdrowie) {
        super(obrażenia, nazwa, zdrowie);
        this.setDefensywa();
        this.setRasa();
    }

    @Override
    public String getRasa() {
        return rasa;
    }

    private void setDefensywa() {
        this.defensywa = Czlowiek.getDefensywa();
    }

    public void setRasa() {
        this.rasa = Czlowiek.rasa;
    }
    
    
}
