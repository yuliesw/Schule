public class Held {
    private String name;
    private int staerke;
    private int lebenspunkte;
    private Waffe meineWaffe; 
    private Waffen [] Waffenlager; 

    public Held(String name, int staerke, int lebenspunkte) {
        this.name = name;
        this.staerke = staerke;
        this.lebenspunkte = lebenspunkte;
    }
    
    public void Waffenlager (){
        Waffenlager = new Waffen [4];
        Waffenlager [0]= new Waffen ("Holz",3);
        Waffenlager [1]= new Waffen ("Eisen",4);
        Waffenlager [2]= new Waffen ("Stahl",5);
        Waffenlager [3]= new Waffen ("Holz",5);
        
    }

    public void getWaffenlager (){
        for ( int i=0; i<Waffenlager.length; i++){
            System.out.println("Die gespeicherte Waffe "+i+" hat das Material"+Waffenlager[i].getMaterial+" und den Magiewert "+Waffenlager.getMagie);
        }
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
