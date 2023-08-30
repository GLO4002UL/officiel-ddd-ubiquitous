package ca.ulaval.glo4002;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BateauTest {

    private Bateau bateau;

    @BeforeEach
    void setUp() {
        bateau = new Bateau(10);
    }

    @Test
    public void peutReserverUnCargaisonPlusPetitQueLaCapacite() {
        var cargaison = new Conteneur(1);

        var reservationReussie = bateau.reserver(cargaison);

        assertTrue(reservationReussie);
    }

    @Test
    public void nePeutPasReserverUnCargaisonPlusGrandQueLaCapacite() {
        var cargaisonTropGrande = new Conteneur(15);

        boolean reservationReussie = bateau.reserver(cargaisonTropGrande);

        assertFalse(reservationReussie);
    }

    @Test
    public void nePeutPasReserverUneCargaisonSiPlusDeCapaciteRestante() {
        var cargaison = new Conteneur(6);

        boolean premiereReservationReussie = bateau.reserver(cargaison);
        boolean deuxiemeReservationReussie = bateau.reserver(cargaison);

        assertTrue(premiereReservationReussie);
        assertFalse(deuxiemeReservationReussie);
    }

}
