package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "commande")
    private List<LigneCommande> contenu = new ArrayList<>();
    String date_commande;
    String status;
    public Commande(){}
    public Commande(Long id, String date_commande, String status, Articles a, int qte) {
        this.id = id;
        this.date_commande = date_commande;
        this.status = status;
        LigneCommande lc = new LigneCommande(a, qte);
        contenu.add(lc);
        lc.setCommande(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<LigneCommande> getContenu() {
        return contenu;
    }

    public void setContenu(List<LigneCommande> contenu) {
        this.contenu = contenu;
    }

    public String getDate_commande() {
        return date_commande;
    }

    public void setDate_commande(String date_commande) {
        this.date_commande = date_commande;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", contenu=" + contenu +
                ", date_commande='" + date_commande + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}