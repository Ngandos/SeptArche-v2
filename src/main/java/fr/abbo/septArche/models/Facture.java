package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "num_fact", length = 50)
    private String numeroDeFacture;
    private Date dateDeFacture;

    @OneToOne(mappedBy = "facture")
    private Commande commande;

    // constructeur,

    public Facture() {
    }

    public Facture(Long id, String numeroDeFacture, Date dateDeFacture, Commande commande) {
        this.id = id;
        this.numeroDeFacture = numeroDeFacture;
        this.dateDeFacture = dateDeFacture;
        this.commande = commande;
    }
// getters et setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroDeFacture() {
        return numeroDeFacture;
    }

    public void setNumeroDeFacture(String numeroDeFacture) {
        this.numeroDeFacture = numeroDeFacture;
    }

    public Date getDateDeFacture() {
        return dateDeFacture;
    }

    public void setDateDeFacture(Date dateDeFacture) {
        this.dateDeFacture = dateDeFacture;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", numeroDeFacture='" + numeroDeFacture + '\'' +
                ", dateDeFacture=" + dateDeFacture +
                ", commande=" + commande +
                '}';
    }
}

