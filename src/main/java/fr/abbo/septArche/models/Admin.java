package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "admin")
@PrimaryKeyJoinColumn(name = "id")
public class Admin extends Utilisateur {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String nivAcces;

    public Admin() {}

    public Admin(long id, String nivAcces) {
        this.id = id;
        this.nivAcces = nivAcces;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNivAcces() {
        return nivAcces;
    }
    public void setNivAcces(String nivAcces) {
        this.nivAcces = nivAcces;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", nivAcces='" + nivAcces + '\'' +
                '}';
    }
}