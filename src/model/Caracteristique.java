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
public class Caracteristique {
    private String nom;

    public Caracteristique() {
    }

    public Caracteristique(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
     public boolean saveCapacite(){
         
         String stament="INSERT INTO `caracteristique`(`nom`) VALUES ('"+this.getNom()+"')";
         boolean ok=new ConnexionBD().InsertUpdateData(stament);
         return ok;
     } 
}
