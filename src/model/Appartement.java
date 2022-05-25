/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pak
 */
public class Appartement {
    private String libelleA;
    private String capciteA;

    public Appartement() {
    }

    public Appartement(String libelleA, String capciteA) {
        this.libelleA = libelleA;
        this.capciteA = capciteA;
    }

    public String getLibelleA() {
        return libelleA;
    }

    public void setLibelleA(String libelleA) {
        this.libelleA = libelleA;
    }

    public String getCapciteA() {
        return capciteA;
    }

    public void setCapciteA(String capciteA) {
        this.capciteA = capciteA;
    }
       public boolean saveAppartement(){
         
         String stament="INSERT INTO `appartement`(`libelleA`, `capaciteA`) VALUES ('"+this.getLibelleA()+"','"+this.getCapciteA()+"')";
         boolean ok=new ConnexionBD().InsertUpdateData(stament);
         return ok;
     } 
    
}
