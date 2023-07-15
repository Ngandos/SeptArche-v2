package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long id;
    String nom;
    String prenom;
    String email;
    Long id_adresses;
    String num_compte;
    Long nb_commandes;

    public Clients(){}

    public Clients(Long id, String nom, String prenom, String email, Long ida_dresses, String num_compte, Long nb_commandes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.id_adresses = id_adresses;
        this.num_compte = num_compte;
        this.nb_commandes = nb_commandes;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getId_adresses() {
        return id_adresses;
    }
    public void setId_adresses(Long id_adresses) {
        this.id_adresses = id_adresses;
    }
    public String getNum_compte() {
        return num_compte;
    }
    public void setNum_compte(String num_compte) {
        this.num_compte = num_compte;
    }
    public Long getNb_commandes() {
        return nb_commandes;
    }
    public void setNb_commandes(Long nb_commandes) {
        this.nb_commandes = nb_commandes;
    }

    @Override
    public String toString() {
        return "Clients{" + "id=" + id + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' + ", id_adresses=" + id_adresses + ", num_compte='" + num_compte + '\'' +
                ", nb_commandes=" + nb_commandes + '}';
    }
}
