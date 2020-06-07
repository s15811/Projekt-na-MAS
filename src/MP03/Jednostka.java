
package MP03;

import java.util.EnumSet;

enum Gatunki {Jednostka, Ork, Czlowiek, Nieumarły};

enum typyJednostwk {Jednostka, Zbliżeniowa, Dystansowa};

public abstract class Jednostka { 
    int zdrowie;

    public int getZdrowie() {
        return zdrowie;
    }

    public void setZdrowie(int zdrowie) {
        this.zdrowie = zdrowie;
    }

    public Jednostka(int zdrowie) {
        this.zdrowie = zdrowie;
    }
    
    public abstract String getStats();
    
    private EnumSet<typyJednostwk> typJednostki = EnumSet.of(typyJednostwk.Jednostka);
    
    private EnumSet<Gatunki> gatunek = EnumSet.of(Gatunki.Jednostka);
}
