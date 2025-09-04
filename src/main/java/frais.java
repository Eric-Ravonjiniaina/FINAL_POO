import java.time.LocalDate;

public class frais {
    private int id;
    private String label;
    private float montantPaye;
    LocalDate datePaiement;
    private LocalDate deadline;

    public frais(int id, String label, float montantPaye, LocalDate deadline) {
        this.id = id;
        this.label = label;
        this.montantPaye = montantPaye;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public float getMontantPaye(etudiant student) {
        return montantPaye;
    }

    public LocalDate getDeadline() {
        return deadline;
    }
    public boolean calculerMontant() {
        float frais = 250000;

        if (datePaiement.isAfter(getDeadline())) {
            System.out.println("LATE: Frais de scolarite en retard");
            return montantPaye != frais;
        }
        if (datePaiement.isBefore(getDeadline())) {
            System.out.println("IN_PROGRESS: Frais de scolarite en cours");
            return montantPaye != frais;
        }
        if (montantPaye > frais) {
            System.out.println("OVERPAID: Un surplus de paiement");
        }
        if (montantPaye == frais) {
            System.out.println("PAYE: Paiement avec succes");
        }
    return false;
    }
}
