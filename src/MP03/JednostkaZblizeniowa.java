
package MP03;

public abstract class JednostkaZblizeniowa extends Jednostka{

    int obrażenia;
    String nazwa;
    
    public JednostkaZblizeniowa(int obrażenia, String nazwa, int zdrowie) {
        super(zdrowie);
        this.nazwa = nazwa;
        this.obrażenia = obrażenia;
    }

    public int getObrażenia() {
        return obrażenia;
    }

    public void setObrażenia(int obrażenia) {
        this.obrażenia = obrażenia;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    
    @Override
    public String getStats() {
        return this.getNazwa() + " ma zdrowie o wysokości " + this.getZdrowie() + " hp oraz obrażenia o wysokości " + this.getObrażenia();
    }
}
