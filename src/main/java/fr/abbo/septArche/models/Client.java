package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany
    private List<Adresses> adresses = new ArrayList<>();
    private String nom;
    private String prenom;
    private String numCompte;
    private Long nbCommandes;

    public Client(){}

    public Client(Long id, String nom, String prenom, String numCompte, Long nbCommandes) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numCompte = numCompte;
        this.nbCommandes = nbCommandes;
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
        return "Client {" + "id=" + id + ", adresses=" + adresses + ", nom='" + nom
                + '\'' + ", prenom='" + prenom + '\'' + ", numCompte='" + numCompte + '\''
                + ", nbCommandes=" + nbCommandes + '}';
    }
}
