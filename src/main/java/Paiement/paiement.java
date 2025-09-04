package Paiement;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class paiement {
    private int id;
    private float montantPaye;
    private LocalDate datePaiement;

    public paiement(int id, float montantPaye, LocalDate datePaiement) {
        this.id = id;
        this.montantPaye = montantPaye;
        this.datePaiement = datePaiement;
    }

    public int getId() {
        return id;
    }

    public float getMontantPaye() {
        return montantPaye;
    }

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public boolean processPaiement(pay paiement, float montant) {
        if (paiement == null ){
            System.out.println("Error: paiement is null");
        }
        return paiement.pay(montant);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMontantPaye(float montantPaye) {
        this.montantPaye = montantPaye;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    @Override
    public String toString() {
        return "paiement{" +
                "id=" + id +
                ", montantPaye=" + montantPaye +
                ", datePaiement=" + datePaiement +
                '}';
    }
}
