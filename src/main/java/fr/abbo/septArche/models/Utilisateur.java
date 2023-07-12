package fr.abbo.septArche.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String role;
    private String email;
    private String wordPass;

    public Long getId() {
        return id;
    }

    public Utilisateur() {}

    public Utilisateur(long id, String role, String email, String wordPass ) {
        this.id = id;
        this.role = role;
        this.email = email;
        this.wordPass = wordPass;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWordPass() {
        return wordPass;
    }

    public void setWordPass(String wordPass) {
        this.wordPass = wordPass;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", email='" + email + '\'' +
                ", wordPass='" + wordPass + '\'' +
                '}';
    }
}