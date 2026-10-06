public class Monster {
    private int angriffswert;
    private int lebenspunkte;

    public Monster(int angriffswert, int lebenspunkte) {
        this.angriffswert = angriffswert;
        this.lebenspunkte = lebenspunkte;
    }

    public int getAngriffswert() {
        return angriffswert;
    }

    public void setAngriffswert(int angriffswert) {
        this.angriffswert = angriffswert;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
}