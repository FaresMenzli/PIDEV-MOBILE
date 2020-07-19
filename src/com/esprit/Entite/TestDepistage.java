/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Entite;

/**
 *
 * @author MKadmin
 */
public class TestDepistage {
    
    private int Reference ;
    private int Resultat ;
    private int Id_Membre ;
    private int Id_Docteur ;

    public TestDepistage(int Reference, int Resultat, int Id_Membre, int Id_Docteur) {
        this.Reference = Reference;
        this.Resultat = Resultat;
        this.Id_Membre = Id_Membre;
        this.Id_Docteur = Id_Docteur;
    }

   
    public int getId_Membre() {
        return Id_Membre;
    }

    public void setId_Membre(int Id_Membre) {
        this.Id_Membre = Id_Membre;
    }

    public int getId_Docteur() {
        return Id_Docteur;
    }

    public void setId_Docteur(int Id_Docteur) {
        this.Id_Docteur = Id_Docteur;
    }
    
    

    public int getReference() {
        return Reference;
    }

    public void setReference(int Reference) {
        this.Reference = Reference;
    }

    public int getResultat() {
        return Resultat;
    }

    public void setResultat(int Resultat) {
        this.Resultat = Resultat;
    }

    @Override
    public String toString() {
        return "TestDepistage{" + "Reference=" + Reference + ", Resultat=" + Resultat + ", Id_Membre=" + Id_Membre + ", Id_Docteur=" + Id_Docteur + '}';
    }
    
    
    
}
