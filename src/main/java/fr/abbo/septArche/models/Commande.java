package fr.abbo.septArche.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(name = "idClient")
    @OneToOne()
    private Client client;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER, mappedBy = "commande")
    private List<LigneCommande> contenu = new ArrayList<>();
    Date dateCommande;
    String status;
    public Commande(){}
    public Commande(String status) {
        this.dateCommande = new Date();
        this.status = status;
    }
    public void ajoutLigneCommande(Articles article, int qte) {
        LigneCommande ligneCommande = new LigneCommande(article, qte);
        contenu.add(ligneCommande);
        ligneCommande.setCommande(this);
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public List<LigneCommande> getContenu() {
        return contenu;
    }
    public void setContenu(List<LigneCommande> contenu) {
        this.contenu = contenu;
    }
    public Date getDateCommande() {
        return dateCommande;
    }
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Commande {" + "id =" + id + "Client =" + client +", contenu =" + contenu + ", dateCommande =" + new Date() +
                ", status =" + status + '}';
    }
}