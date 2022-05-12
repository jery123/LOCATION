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
public class Bailleur {
    
    private String nomB;
    private String prenomB;
    private String sexeB;
    private String telB;
    private String emailB;
    private String villeB;
    private String cniB;
    private String pwdB;

    public Bailleur(String nomB, String prenomB, String sexeB, String telB, String emailB, String villeB, String cniB, String pwdB) {
        this.nomB = nomB;
        this.prenomB = prenomB;
        this.sexeB = sexeB;
        this.telB = telB;
        this.emailB = emailB;
        this.villeB = villeB;
        this.cniB = cniB;
        this.pwdB = pwdB;
    }

    public Bailleur() {
    }

    public String getNomB() {
        return nomB;
    }

    public void setNomB(String nomB) {
        this.nomB = nomB;
    }

    public String getPrenomB() {
        return prenomB;
    }

    public void setPrenomB(String prenomB) {
        this.prenomB = prenomB;
    }

    public String getSexeB() {
        return sexeB;
    }

    public void setSexeB(String sexeB) {
        this.sexeB = sexeB;
    }

    public String getTelB() {
        return telB;
    }

    public void setTelB(String telB) {
        this.telB = telB;
    }

    public String getEmailB() {
        return emailB;
    }

    public void setEmailB(String emailB) {
        this.emailB = emailB;
    }

    public String getVilleB() {
        return villeB;
    }

    public void setVilleB(String villeB) {
        this.villeB = villeB;
    }

    public String getCniB() {
        return cniB;
    }

    public void setCniB(String cniB) {
        this.cniB = cniB;
    }

    public String getPwdB() {
        return pwdB;
    }

    public void setPwdB(String pwdB) {
        this.pwdB = pwdB;
    }
    
     public boolean saveBailleur(){
         
         String stament="INSERT INTO `bailleur`(`nomB`, `prenomB`, `sexeB`, `cniB`, `telB`, `emailB`, `villleB`, `pwdB`) VALUES ('"+this.getNomB()+"','"+this.getPrenomB()+"','"+this.getSexeB()+"','"+this.getCniB()+"','"+this.getTelB()+"','"+this.getEmailB()+"','"+this.getVilleB()+"','"+this.getPwdB()+"')";
         boolean ok=new ConnexionBD().InsertUpdateData(stament);
         return ok;
     } 
    
}
