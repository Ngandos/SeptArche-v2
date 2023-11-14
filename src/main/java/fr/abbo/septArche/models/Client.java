package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "username")
public class Client extends User {
    @OneToMany
    private List<Adresses> adresses = new ArrayList<>();
    @OneToMany
    private List<Commande> commandes = new ArrayList<>();
    private String nom;
    private String prenom;
    private String numCompte;

    public Client() {
    }

    public Client(Long id, String username, String nom, String prenom, String numCompte, String email, String password, String role) {
        super(id, username, email, password, role);
        this.username = username;
        this.nom = nom;
        this.prenom = prenom;
        this.numCompte = numCompte;
        this.email = email;
        this.password = password;
    }

    public List<Adresses> getAdresses() {
        return adresses;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "adresses=" + adresses +
                ", commandes=" + commandes +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numCompte='" + numCompte + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
