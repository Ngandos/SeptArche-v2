package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "auteurs")
public class Auteurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nom;

    public Auteurs() {}
    public Auteurs(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public long getId() {
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

    @Override
    public String toString() {
        return "Auteurs{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}