package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "auteurs")
public class Auteurs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private String nom;
    public Auteurs() {}
    public Auteurs(String nom) {
        this.nom = nom;
    }
    public String getNom(String nom) {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString() {
        return "Auteurs{" +
                "nom='" + nom + '\'' + '}';
    }
}