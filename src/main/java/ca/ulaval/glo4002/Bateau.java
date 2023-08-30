package ca.ulaval.glo4002;

import java.util.ArrayList;

public class Bateau {

    private int capacite;
    private ArrayList<Conteneur> conteneurs = new ArrayList<>();

    public Bateau(int capacite) {
        this.capacite = capacite;
    }

    public boolean reserver(Conteneur cargo) {
        if (!cargo.peutRentrerDans(this.capaciteRestante())) {
            return false;
        }
        this.conteneurs.add(cargo);
        return true;
    }

    private int capaciteRestante() {
        return conteneurs.stream()
                .map(Conteneur::getTaille)
                .reduce(this.capacite, (capaciteRestante, size) -> (capaciteRestante - size));
    }
}
