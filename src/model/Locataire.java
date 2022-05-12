/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Vector;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author pak
 */
public class Locataire {
    private String nomL;
    private String prenomL;
    private String sexeL;
    private String telL;
    private String emailL;
    private String villeL;
    private String cniL;
    private String pwdL;
    private String natio;

    public Locataire() {
    }

    public Locataire(String nomL, String prenomL, String sexeL, String telL, String emailL, String villeL, String cniL, String pwdL, String natio) {
        this.nomL = nomL;
        this.prenomL = prenomL;
        this.sexeL = sexeL;
        this.telL = telL;
        this.emailL = emailL;
        this.villeL = villeL;
        this.cniL = cniL;
        this.pwdL = pwdL;
        this.natio = natio;
    }

    public String getNomL() {
        return nomL;
    }

    public void setNomL(String nomL) {
        this.nomL = nomL;
    }

    public String getPrenomL() {
        return prenomL;
    }

    public void setPrenomL(String prenomL) {
        this.prenomL = prenomL;
    }

    public String getSexeL() {
        return sexeL;
    }

    public void setSexeL(String sexeL) {
        this.sexeL = sexeL;
    }

    public String getTelL() {
        return telL;
    }

    public void setTelL(String telL) {
        this.telL = telL;
    }

    public String getEmailL() {
        return emailL;
    }

    public void setEmailL(String emailL) {
        this.emailL = emailL;
    }

    public String getVilleL() {
        return villeL;
    }

    public void setVilleL(String villeL) {
        this.villeL = villeL;
    }

    public String getCniL() {
        return cniL;
    }

    public void setCniL(String cniL) {
        this.cniL = cniL;
    }

    public String getPwdL() {
        return pwdL;
    }

    public void setPwdL(String pwdL) {
        this.pwdL = pwdL;
    }

    public String getNatio() {
        return natio;
    }

    public void setNatio(String natio) {
        this.natio = natio;
    }
  

    
         public boolean saveLocataire(){
         
         String stament="INSERT INTO `locataire`( `nomL`, `prenomL`, `telL`, `emailL`, `pwdL`, `nationaliteL`, `cniL`, `sexeL`) VALUES ('"+this.getNomL()+"','"+this.getPrenomL()+"','"+this.getTelL()+"','"+this.getEmailL()+"','"+this.getPwdL()+"','"+this.getNatio()+"','"+this.getCniL()+"','"+this.getSexeL()+"')";
         boolean ok=new ConnexionBD().InsertUpdateData(stament);
         return ok;
     } 
        public JTable listLocataire(){
    String query="SELECT `idL`, `nomL`, `prenomL`, `telL`, `emailL`, `pwdL`, `nationaliteL`, `cniL`, `sexeL`, `villeL` FROM `locataire`";
      String[] champs ={"nomL","emailL","sexeL","telL","villeL"};
      Vector<String> titres=new Vector<String>();
      titres.addElement("Nom");
      titres.addElement("Email");
      titres.addElement("Sexe");
      titres.addElement("Tel. locataire");
      titres.addElement("Ville");
      JTable table= new ConnexionBD().getData(query, champs, titres);
      return table;
  }
          public boolean updateLocataire(String mail){
      String sql="UPDATE `locataire` SET "             
              + "`nomL`='"+this.getNomL()+"',"
              + "`prenomL`='"+this.getPrenomL()+"',"
              + "`telL`='"+this.getTelL()+"',"
              + "`sexeL`='"+this.getSexeL()+"',"
              + "`villeL`='"+this.getVilleL()+"',"
              + "`nationaliteL`='"+this.getNatio()+"',"
              + "`emailL`='"+this.getEmailL()+"' WHERE `emailL`='"+mail+"'";
       boolean statement=new ConnexionBD().InsertUpdateData(sql);
       
        return statement;
    }
    public boolean deleteLocataire(String Email){
         String sql="DELETE FROM `locataire` WHERE emailL='"+Email+"'";
        boolean stat=false;
        stat=new ConnexionBD().InsertUpdateData(sql);
        return stat;
    }
        
}
