import Paiement.paiement;
import Paiement.paiementCard;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StatisticTest {
    @BeforeEach
    void setUp(){
        etudiant Toky = new etudiant(1,"Toky", "Mahery", LocalDate.of(2025,11,5), "K3");
        frais Mensuel = new frais(1,"Frais Mensuel", 120000,LocalDate.of(2025, 12,4));
        paiementCard paiement = new paiementCard("346");
    }
}