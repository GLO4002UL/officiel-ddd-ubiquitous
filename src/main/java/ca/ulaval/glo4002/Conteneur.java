package ca.ulaval.glo4002;

public class Conteneur {
    private final int taille;

    public Conteneur(int taille) {
        this.taille = taille;
    }

    public boolean peutRentrerDans(int capacite) {
        return taille <= capacite;
    }

    public int getTaille() {
        return taille;
    }
}
