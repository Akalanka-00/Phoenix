/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phoenix.classes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucifer
 */
public class conSQL {
    public Connection conn;
    public Statement st;  
    public String query;

    public static void main(String args[]) {
        //  conSQL sql = new conSQL();
        //  sql.startDBConnection();
        //  sql.rowCount();
        // sql.accNames(0);
    }

    public void startDBConnection() {
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/accounting";
        String dClass = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(dClass);
            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();
         //   String query = "Select * from cashbook";
         //   ResultSet rs = st.executeQuery(query);
            
         //   while (rs.next()) {
         //       System.out.println(rs.getString("Description"));
        //    }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error available : " + e);
        }

    }

    public int rowCount() {
         query = "select count(*) from  main";
         int count =0;
        try {
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                count = rs.getInt(1);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return count;
    }

    public String accNames(int r) {
        query = "select * from  main";
        int count = 0;
        String accName = "";
        try {
            ResultSet rs = st.executeQuery(query);          
            while(rs.next()){
                accName = rs.getString("ledger_name");
                if(count == r){
                    break;
                }
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return accName;
    }


    public String accDiscription(int r) {
       query = "select * from  main";
        int count = 0;
        String discription = "";
        try {
            ResultSet rs = st.executeQuery(query);          
            while(rs.next()){
                discription = rs.getString("ledger_description");
                if(count == r){
                    break;
                }
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return discription;
    }

    public void SubmitCompanyData(String ownerName, String companyName, String address, int Vat, String mail, int phone, String username, String psw) {
        System.out.println(ownerName + companyName + address + Vat + mail + phone + username + psw);
    }
    
    public Boolean loginCredentials(String uname,String psw){
        String sqlUname = "";
        String sqlPsw = "";
        query = "select * from  company";
        try {
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                if(!rs.getString("username").equals("") && !rs.getString("password").equals("")){
                     sqlUname = rs.getString("username");
                sqlPsw = rs.getString("password");
                }
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if( (sqlUname.equals(uname) && sqlPsw.equals(psw))){
            return true;
        }else{
            System.out.println("SqlUsername\t:" + sqlUname+"Username\t:" + uname+"Password\t:" + psw+"SqlPsw\t:" + sqlPsw);
        return false;
        }
              
    }

}
