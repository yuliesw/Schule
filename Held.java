public class Held {
    private String name;
    private int staerke;
    private int lebenspunkte;
    private Waffe meineWaffe; 

    public Held(String name, int staerke, int lebenspunkte) {
        this.name = name;
        this.staerke = staerke;
        this.lebenspunkte = lebenspunkte;
    }

    public int getAngriffswert() {
        int waffenSchaden = (meineWaffe != null) ? meineWaffe.bonusBerechnen() : 0;
        return this.staerke + waffenSchaden;
    }

    public void angreifen(Monster g, Kampfregel r) {
        System.out.println(this.name + " greift das Monster an!");
        r.kampf(this, g);
    }

    public void lebenspunkteVerringern() {
        this.lebenspunkte--;
        if (this.lebenspunkte < 0) {
            System.out.println(this.name + " hat keine Lebenspunkte mehr! Das Spiel ist beendet.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public Waffe getMeineWaffe() {
        return meineWaffe;
    }

    public void setMeineWaffe(Waffe waffe) {
        this.meineWaffe = waffe;
    }
}
