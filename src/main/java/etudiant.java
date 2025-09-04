import Paiement.paiement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class etudiant {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateRentreeHEI;
    private List<groupe> historiqueGroupe;
    private List<frais> listeFrais;
    private List<paiement> listePaiement;

    public etudiant(int id, String nom, String prenom, LocalDate dateRentreeHEI, String historiqueGroupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateRentreeHEI = dateRentreeHEI;
        this.listeFrais = new ArrayList<>();
        this.listePaiement = new ArrayList<>();
        this.historiqueGroupe = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateRentreeHEI() {
        return dateRentreeHEI;
    }

    public List<groupe> getHistoriqueGroupe() {
        return historiqueGroupe;
    }

    public void setHistoriqueGroupe(List<groupe> historiqueGroupe) {
        this.historiqueGroupe = historiqueGroupe;
    }

}
