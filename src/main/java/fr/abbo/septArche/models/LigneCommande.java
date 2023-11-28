package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ligne_commande")
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name="article_id")
    private Articles article;
    private int quantite;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    public LigneCommande(){}

    public LigneCommande(Long id, Articles article, int quantite) {
        this.id = id;
        this.article = article;
        this.quantite = quantite;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Articles getArticle() {
        return article;
    }

    public void setArticle(Articles article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", article=" + article +
                ", quantite=" + quantite +
                ", commande=" + commande +
                '}';
    }
}