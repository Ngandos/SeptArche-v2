package fr.abbo.septArche.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
@Table(name = "editeurs")
public class Editeurs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long id;
    String enseigne;

    public Editeurs(){}
    public Editeurs(Long id, String enseigne) {
        this.id = id;
        this.enseigne = enseigne;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEnseigne() {
        return enseigne;
    }
    public void setEnseigne(String Enseigne) {
        this.enseigne = enseigne;
    }
    @Override
    public String toString() {
        return "Editeurs{" +
                "id=" + id +
                ", raison_sociale='" + enseigne + '\'' +
                '}';
    }
}
