package fr.abbo.septArche.models;

public class LignesPanier {

    Long id;
    String article;
    Long Qte;
    Long prixUnit;
    Long prixGlob;
    public LignesPanier(Long id, String article, Long qte, Long prixUnit, Long prixGlob) {
        this.id = id;
        this.article = article;
        Qte = qte;
        this.prixUnit = prixUnit;
        this.prixGlob = prixGlob;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getArticle() {
        return article;
    }
    public void setArticle(String article) {
        this.article = article;
    }
    public Long getQte() {
        return Qte;
    }
    public void setQte(Long qte) {
        Qte = qte;
    }
    public Long getPrixUnit() {
        return prixUnit;
    }
    public void setPrixUnit(Long prixUnit) {
        this.prixUnit = prixUnit;
    }
    public Long getPrixGlob() {
        return prixGlob;
    }
    public void setPrixGlob(Long prixGlob) {
        this.prixGlob = prixGlob;
    }
    @Override
    public String toString() {
        return "LignesPanier{" + "id=" + id + ", article='" + article + '\'' + ", Qte=" + Qte + ", prixUnit=" + prixUnit + ", prixGlob=" + prixGlob + '}';
    }
}
