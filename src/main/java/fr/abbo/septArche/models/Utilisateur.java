package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private boolean isAdmin;
    private String pseudo;
    private String email;

    public Utilisateur() {}

    public Utilisateur(Long id, boolean isAdmin, String pseudo, String email) {
        this.id = id;
        this.isAdmin = isAdmin;
        this.pseudo = pseudo;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", isAdmin=" + isAdmin +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}