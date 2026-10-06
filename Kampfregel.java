public class Kampfregel {
    private final Wuerfel wuerfel6;
    private final Wuerfel wuerfel10;

    public Kampfregel() {
        this.wuerfel6 = new Wuerfel(6);
        this.wuerfel10 = new Wuerfel(10);
    }

    public void kampf(Held k1, Monster k2) {
        int heldWurf = wuerfel6.wuerfeln();
        int monsterWurf = wuerfel10.wuerfeln();
        int heldErgebnis = k1.getAngriffswert() + heldWurf;
        int monsterErgebnis = k2.getAngriffswert() + monsterWurf;

        System.out.println(k1.getName() + " würfelt " + heldWurf
                + " (Kampfergebnis: " + heldErgebnis + ").");
        System.out.println("Das Monster würfelt " + monsterWurf
                + " (Kampfergebnis: " + monsterErgebnis + ").");

        if (heldErgebnis > monsterErgebnis) {
            k2.setLebenspunkte(k2.getLebenspunkte() - 1);
            System.out.println(k1.getName() + " gewinnt den Kampf. "
                    + "Das Monster verliert einen Lebenspunkt.");
        } else if (monsterErgebnis > heldErgebnis) {
            k1.lebenspunkteVerringern();
            System.out.println("Das Monster gewinnt den Kampf. "
                    + k1.getName() + " verliert einen Lebenspunkt.");
        } else {
            System.out.println("Unentschieden: Niemand verliert einen Lebenspunkt.");
        }
    }
}