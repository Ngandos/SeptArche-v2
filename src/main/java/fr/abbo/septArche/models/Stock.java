package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "stock")
@Inheritance(strategy = InheritanceType.JOINED)
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    Long id;
    String designation;
    String dispo;
    public Stock(){}
    public Stock(Long id, String designation, String dispo) {
        this.id = id;
        this.designation = designation;
        this.dispo = dispo;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getNbDispo() {
        return dispo;
    }
    public void setDispo(String dispo) {
        this.dispo = dispo;
    }
    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", nbDispo='" + dispo + '\'' +
                '}';
    }
}
