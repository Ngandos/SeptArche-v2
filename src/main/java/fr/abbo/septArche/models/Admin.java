package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
@PrimaryKeyJoinColumn(name = "id")
public class Admin extends Utilisateur {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name="utilisateur_id")
    private Utilisateur utilisateur;

    public Admin() {}

    public Admin(long id, Utilisateur utilisateur) {
        this.id = id;
        this.utilisateur = utilisateur;
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

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", utilisateur=" + utilisateur + '}';
    }
}