import Paiement.paiement;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        etudiant Toky = new etudiant(1,"Toky", "Mahery", LocalDate.of(2025,11,5), "K3");
        frais Mensuel = new frais(1,"Frais Mensuel", 120000,LocalDate.of(2025, 12,4));
        paiement paiement = new paiement(1, 120000, LocalDate.of(2025, 12,2));

        Mensuel.calculerMontant();
    }
}
