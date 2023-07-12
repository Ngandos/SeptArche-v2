package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long id;
    @ManyToOne
    @JoinColumn(name="utilisateur_id")
    private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name="adresse_id")
    private Adresses adresses;
    private String nom;
    private String prenom;
    private String email;
    private String numCompte;
    private Long nbCommandes;

    public Clients(){}

    public Clients(Long id, Utilisateur utilisateur, Adresses adresses, String nom, String prenom, String email, String numCompte, Long nbCommandes) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.adresses = adresses;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numCompte = numCompte;
        this.nbCommandes = nbCommandes;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    public Adresses getAdresses() {
        return adresses;
    }
    public void setAdresses(Adresses adresses) {
        this.adresses = adresses;
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
        return "Clients{" + "id=" + id + ", utilisateur=" + utilisateur + ", adresses=" + adresses + ", nom='" + nom + '\'' + ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' + ", numCompte='" + numCompte + '\'' + ", nbCommandes=" + nbCommandes + '}';
    }
}
