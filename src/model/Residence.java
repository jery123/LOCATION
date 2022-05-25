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
public class Residence {
    
    private String nomR;
    private String villeR;

    public Residence(String nomR, String villeR) {
        this.nomR = nomR;
        this.villeR = villeR;
    }

    public Residence() {
    }

    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    public String getVilleR() {
        return villeR;
    }

    public void setVilleR(String villeR) {
        this.villeR = villeR;
    }
           public boolean saveResidence(){
         
         String stament="INSERT INTO `residence`(`nomR`, `villeR`) VALUES ('"+this.getNomR()+"','"+this.getVilleR()+"')";
         boolean ok=new ConnexionBD().InsertUpdateData(stament);
         return ok;
     } 
}
