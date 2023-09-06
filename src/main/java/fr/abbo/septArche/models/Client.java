package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Users {
    @OneToMany
    private List<Adresses> adresses = new ArrayList<>();
    private String nom;
    private String prenom;
    private String numCompte;
    private Long nbCommandes;

    public Client(){}

    public Client(String nom, String prenom, String numCompte, Long nbCommandes) {

        this.nom = nom;
        this.prenom = prenom;
        this.numCompte = numCompte;
        this.nbCommandes = nbCommandes;
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
    public Long getNbCommandes() {
        return nbCommandes;
    }
    public void setNbCommandes(Long nbCommandes) {
        this.nbCommandes = nbCommandes;
    }

    @Override
    public String toString() {
        return "Client {adresses=" + adresses + ", nom='" + nom
                + '\'' + ", prenom='" + prenom + '\'' + ", numCompte='" + numCompte + '\''
                + ", nbCommandes=" + nbCommandes + '}';
    }
}
