/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author yassi
 */
public class chart {
    private int id;
    private int nbr;
    private String lb;

    public chart(int nbr, String lb) {
        this.nbr = nbr;
        this.lb = lb;
    }

    public chart(int id, int nbr, String lb) {
        this.id = id;
        this.nbr = nbr;
        this.lb = lb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }
    
    
    
}
