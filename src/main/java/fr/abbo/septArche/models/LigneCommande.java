package fr.abbo.septArche.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ligne_commande")
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name="article_id")
    private Articles articles;
    private int quantite;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;
    public LigneCommande(){}

    public LigneCommande(Articles articles, int quantite) {
        this.articles = articles;
        this.quantite = quantite;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Articles getArticles() {
        return articles;
    }
    public void setArticles(Articles articles) {
        this.articles = articles;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", articles=" + articles +
                ", quantite=" + quantite +
                '}';
    }
}