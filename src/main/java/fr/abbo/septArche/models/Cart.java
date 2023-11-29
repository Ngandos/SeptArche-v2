package fr.abbo.septArche.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cart {
    private int numComm;
    private Date dateComm;
    private String status;
    private List<CartLineItem> contenu = new ArrayList<>();

    public Cart() {}

    public Cart(int numComm, Date dateComm, String status, List<CartLineItem> contenu) {
        this.numComm = numComm;
        this.dateComm = dateComm;
        this.status = status;
        this.contenu = contenu;
    }

    public int getNumComm() {
        return numComm;
    }

    public void setNumComm(int numComm) {
        this.numComm = numComm;
    }

    public Date getDateComm() {
        return dateComm;
    }

    public void setDateComm(Date dateComm) {
        this.dateComm = dateComm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CartLineItem> getContenu() {
        return contenu;
    }

    public void setContenu(List<CartLineItem> contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "numComm=" + numComm +
                ", dateComm=" + dateComm +
                ", status='" + status + '\'' +
                ", contenu=" + contenu +
                '}';
    }
}
