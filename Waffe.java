public class Waffe {
    private String material;
    private int magie;

    public Waffe(String material, int magie) {
        setMaterial(material);
        this.magie = magie;
    }

    public int bonusBerechnen() {
        return materialSchaden(material) + magie;
    }

    private int materialSchaden(String material) {
        if (material.equalsIgnoreCase("Holz")) {
            return 1;
        }
        if (material.equalsIgnoreCase("Eisen")) {
            return 2;
        }
        if (material.equalsIgnoreCase("Stahl")) {
            return 3;
        }
        throw new IllegalArgumentException("Unbekanntes Waffenmaterial: " + material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (material == null) {
            throw new IllegalArgumentException("Das Waffenmaterial darf nicht null sein.");
        }
        materialSchaden(material);
        this.material = material;
    }

    public int getMagie() {
        return magie;
    }

    public void setMagie(int magie) {
        this.magie = magie;
    }
}