package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "username")
public class Client extends Users {
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "id")
    private List<Adresses> adresses = new ArrayList<>();
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "id")
    private List<Commande> commandes = new ArrayList<>();
    private String nom;
    private String prenom;
    private String numCompte;

    public Client(){}

    public Client(String nom, String prenom, String numCompte) {
        this.nom = nom;
        this.prenom = prenom;
        this.numCompte = numCompte;
    }

    public List<Adresses> getAdresses() {
        return adresses;
    }
    public void addAdresse(Adresses adresse) {
        this.adresses.add(adresse);
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

    public void setAdresses(List<Adresses> adresses) {
        this.adresses = adresses;
    }
    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "adresses=" + adresses +
                ", commandes=" + commandes +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numCompte='" + numCompte + '\'' +
                '}';
    }
}
