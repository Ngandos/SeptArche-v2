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
    @JoinColumn(name = "adresses_id",nullable = false)
    @OneToMany
    private List<Adresses> adresses = new ArrayList<>();
    private int codePostal;
    @JoinColumn(name = "commande_id",nullable = false)
    @OneToMany
    private List<Commande> commandes = new ArrayList<>();
    private String nom;
    private String prenom;
    private String numClient;

    public Client(){}

    public Client(Long id, String nom, String prenom, String numClient) {
        this.id = id;
        this.adresses = adresses;
        this.codePostal = codePostal;
        this.commandes = commandes;
        this.nom = nom;
        this.prenom = prenom;
        this.numClient = numClient;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public List<Adresses> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adresses> adresses) {
        this.adresses = adresses;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
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

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", adresses=" + adresses +
                ", codePostal=" + codePostal +
                ", commandes=" + commandes +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numClient='" + numClient + '\'' +
                '}';
    }
}
