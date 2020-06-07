
package MP03;

public abstract class Czlowiek extends Jednostka implements RasaCzlowiek{
    final static int defensywa = 10;
    final static String rasa = "Człowiek";

    public Czlowiek(int zdrowie) {
        super(zdrowie);
    }

    public static int getDefensywa() {
        return defensywa;
    }
}
