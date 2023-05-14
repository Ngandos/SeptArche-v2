package fr.abbo.septArche.models;

public class Panier {
    Long id;
    Long montantHt;
    String tva;
    Long montantTTC;

    public Panier(){}
    public Panier(Long id, Long montantHt, String tva, Long montantTTC) {
        this.id = id;
        this.montantHt = montantHt;
        this.tva = tva;
        this.montantTTC = montantTTC;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getMontantHt() {
        return montantHt;
    }
    public void setMontantHt(Long montantHt) {
        this.montantHt = montantHt;
    }
    public String getTva() {
        return tva;
    }
    public void setTva(String tva) {
        this.tva = tva;
    }
    public Long getMontantTTC() {
        return montantTTC;
    }
    public void setMontantTTC(Long montantTTC) {
        this.montantTTC = montantTTC;
    }
    @Override
    public String toString() {
        return "Panier{" +
                "id=" + id +
                ", montantHt=" + montantHt +
                ", tva='" + tva + '\'' +
                ", montantTTC=" + montantTTC +
                '}';
    }
}
