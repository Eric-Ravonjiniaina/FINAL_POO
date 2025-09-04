import Paiement.paiement;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Statistic extends frais{
    private float montantPaye;
    private etudiant student;
    private LocalDate datePaiement;
    private List<paiement> listePaiement;
    private List<frais> listeFrais;

    public Statistic(int id, String label, float montantPaye, LocalDate deadline) {
        super(id, label, montantPaye, deadline);
        this.montantPaye = montantPaye;
        this.student = student;
    }
    public float getMontantPaye(etudiant student) {
        return montantPaye;
    }

    public List<frais> getListeFrais() {
        return listeFrais;
    }

    public List<paiement> getListePaiement() {
        return listePaiement;
    }

    public etudiant getStudent() {
        return student;
    }

    public List<frais> getLateFee(List<frais> frais, Instant t) {
        List<frais> resultFee = listeFrais.stream()
                .filter(p -> p.datePaiement.isBefore(getDeadline()))
                .collect(Collectors.toList());
        return resultFee;
    }
    public List<frais> getTotalMissingFee(List<frais> frais, Instant t) {
        List<frais> totalFrais = listeFrais.stream()
                .filter(p -> p.datePaiement.isBefore(getDeadline()))
                .mapToDouble(Paiement::getMontantPaye)
                .sum();

        return totalFrais;
    }
    double getTotalPaidByStudent(etudiant student, List<frais> fees, Instant t){
        double totalParEtudiant = listeFrais.stream()
                .filter(f -> f.getMontantPaye(student))
                .mapToDouble(Paiement::getMontantPaye)
                .sum()
    }
}
