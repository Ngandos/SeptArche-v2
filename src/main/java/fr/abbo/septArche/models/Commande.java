package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "num_comm", length = 50)
    private String numComm;

    @Column(name = "date_comm")
    private LocalDate dateComm;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;
    @OneToOne
    private Facture facture;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<LigneCommande> lignesCommande = new ArrayList<>();


    //constructeur

    public Commande() {
    }

    public Commande(Long id, String numComm, LocalDate dateComm, Utilisateur utilisateur, List<LigneCommande> lignesCommande) {
    }

    public Commande(Long id, String numComm, LocalDate dateComm, Utilisateur utilisateur, Facture facture, List<LigneCommande> lignesCommande) {
        this.id = id;
        this.numComm = numComm;
        this.dateComm = dateComm;
        this.utilisateur = utilisateur;
        this.facture = facture;
        this.lignesCommande = lignesCommande;
//        this.articles = articles;
    }

    // getters et setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumComm() {
        return numComm;
    }

    public void setNumComm(String numComm) {
        this.numComm = numComm;
    }

    public LocalDate getDateComm() {
        return dateComm;
    }

    public void setDateComm(LocalDate dateComm) {
        this.dateComm = dateComm;
    }

    public Utilisateur getUser() {
        return utilisateur;
    }

    public void setUser(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<LigneCommande> getLignesCommande() {
        return lignesCommande;
    }

    public void setLignesCommande(List<LigneCommande> lignesCommande) {
        this.lignesCommande = lignesCommande;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", numComm='" + numComm + '\'' +
                ", dateComm=" + dateComm +
                ", utilisateur=" + utilisateur +
                ", facture=" + facture +
                ", lignesCommande=" + lignesCommande +
                '}';
    }
}

