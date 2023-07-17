package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "adresses")
public class Adresses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    Long numRue;
    String rue;
    String codePostal;
    String ville;
    String pays;
    public Adresses(){}
    public Adresses(Long id, Long numRue, String rue, String codePostal, String ville, String pays) {
        this.id = id;
        this.numRue = numRue;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getNum_rue() {
        return numRue;
    }
    public void setNumRue(Long num_rue) {
        this.numRue = numRue;
    }
    public String getRue() {
        return rue;
    }
    public void setRue(String rue) {
        this.rue = rue;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }
    @Override
    public String toString() {
        return "Adresses{" +
                "id=" + id +
                ", numRue=" + numRue +
                ", rue='" + rue + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                '}';
    }
}