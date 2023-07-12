package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String role;
    @ManyToOne
    @JoinColumn(name="utilisateur_id")
    private Utilisateur utilisateur;

    public Admin() {}

    public Admin(long id, String role, Utilisateur utilisateur) {
        this.id = id;
        this.role = role;
        this.utilisateur = utilisateur;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", role='" + role + '\'' + ", utilisateur=" + utilisateur + '}';
    }
}