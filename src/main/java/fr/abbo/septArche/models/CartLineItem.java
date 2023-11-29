package fr.abbo.septArche.models;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class CartLineItem {

    private Long id;
    private Long article;
    private int quantite;

    public CartLineItem(){}

    public CartLineItem(Long id, Long article, int quantite) {
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

    public Long getArticle() {
        return article;
    }

    public void setArticle(Long article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "CartLineItem{" +
                "id=" + id +
                ", article=" + article +
                ", quantite=" + quantite +
                '}';
    }
}
