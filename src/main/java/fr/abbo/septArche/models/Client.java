package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany
    private List<Adresses> adresses = new ArrayList<>();
    @OneToMany
    private List<Commande> commande = new ArrayList<>();
    private String nom;
    private String prenom;
    private String numCompte;

    public Client(){}

    public Client(Long id, String nom, String prenom, String numCompte) {
        this.id = id;
        this.adresses = adresses;
        this.commande = commande;
        this.nom = nom;
        this.prenom = prenom;
        this.numCompte = numCompte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Adresses> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresses> adresses) {
        this.adresses = adresses;
    }

    public List<Commande> getCommande() {
        return commande;
    }

    public void setCommande(List<Commande> commande) {
        this.commande = commande;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", adresses=" + adresses +
                ", commande=" + commande +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numCompte='" + numCompte + '\'' +
                '}';
    }
}
