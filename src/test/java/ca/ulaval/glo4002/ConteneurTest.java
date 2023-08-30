package ca.ulaval.glo4002;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConteneurTest {

    private final Conteneur conteneur;

    public ConteneurTest() {
        conteneur = new Conteneur(2);
    }

    @Test
    void largerThanCapacityDoesNotFit() {
        assertFalse(conteneur.peutRentrerDans(1));
    }

    @Test
    void smallerThanCapacityFits() {
        assertTrue(conteneur.peutRentrerDans(3));
    }

    @Test
    void sameSizeAsCapacityFits() {
        assertTrue(conteneur.peutRentrerDans(2));
    }
}