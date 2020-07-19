///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.esprit.Service;
//
//import com.esprit.Entite.TestDepistage;
////import com.esprit.Iservice.IService;
////import com.esprit.utils.DataBase;
////import java.sql.*;
////import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
////import java.util.logging.Level;
////import java.util.logging.Logger;
//
///**
// *
// * @author MKadmin
// */
//public class ServiceTestDepistage implements IService<TestDepistage> {
//
//    // implementation des methodes qui vont faire le traitement avec le DB
//    private Connection con = DataBase.getInstance().getConnection();
//    private Statement ste;
//
//    public ServiceTestDepistage() {
//        try {
//            ste = con.createStatement();
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//    }
//
//    /* public boolean ajouterTestDepistage (TestDepistage TD){
//    
//    
//    return true ;}*/
//    @Override
//    public boolean ajouter(TestDepistage t) throws SQLException {
//        boolean etat = false;
//        String requete = "INSERT INTO `test_dépistage` (`Référence`, `Résultat`, `Id_Membre`, `Id_docteur`) VALUES ('" + t.getReference() + "', '" + t.getResultat() + "', '" + t.getId_Membre() + "', '" + t.getId_Docteur() + "');";
//        int res = ste.executeUpdate(requete);
//        if (res != 0) {
//            etat = true;
//        }
//        return etat;
//    }
//
//    @Override
//    public List<TestDepistage> readAll() throws SQLException {
//        List<TestDepistage> list = new ArrayList();
//        ResultSet rs = ste.executeQuery("select * from test_dépistage")  ;
//        while (rs.next()) {
//            int Reference = rs.getInt(1);
//            int Resultat = rs.getInt(2);
//            int Id_Membre = rs.getInt(3);
//            int Id_Docteur = rs.getInt(4);
//            TestDepistage TD = new TestDepistage(Reference, Resultat, Id_Membre, Id_Docteur);
//            list.add(TD) ;
//        }
//        return list ;
//
//    }
//}
