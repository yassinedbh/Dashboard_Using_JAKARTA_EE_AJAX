package beans;

import java.util.Date;

public class Machine {

    private int id;
    private String reference;
    private Date dateAchat;
    private double prix;
    private int idmarque;


    public Machine(int id, String reference, Date dateAchat, double prix, int idmarque) {
        this.id = id;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.idmarque = idmarque;
    }

    public Machine(String reference, Date dateAchat, double prix, int idmarque) {
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
        this.idmarque = idmarque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getIdmarque() {
        return idmarque;
    }

    public void setIdmarque(int idmarque) {
        this.idmarque = idmarque;
    }
    
    
    

    @Override
    public String toString() {
        return this.id + " " + this.reference;
    }

}
