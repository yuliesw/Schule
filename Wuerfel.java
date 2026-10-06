import java.util.concurrent.ThreadLocalRandom;

public class Wuerfel {
    private int anzahlSeiten;

    public Wuerfel(int anzahlSeiten) {
        setAnzahlSeiten(anzahlSeiten);
    }

    public int wuerfeln() {
        return ThreadLocalRandom.current().nextInt(anzahlSeiten) + 1;
    }

    public int getAnzahlSeiten() {
        return anzahlSeiten;
    }

    public void setAnzahlSeiten(int anzahlSeiten) {
        if (anzahlSeiten < 1) {
            throw new IllegalArgumentException("Ein Würfel muss mindestens eine Seite haben.");
        }
        this.anzahlSeiten = anzahlSeiten;
    }
}