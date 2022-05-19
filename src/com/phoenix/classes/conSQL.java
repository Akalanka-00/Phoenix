/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phoenix.classes;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucifer
 */
public class conSQL {
    public Connection conn;
    public Statement st;  
    public String query;

    public static void main(String args[]) {
       
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

    public int rowCount(String tableName) {
         query = "select count(*) from "+ tableName;
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

    public String accNames(int r, String getStr) {
        query = "select * from  main";
        int count = 0;
        String accName = "";
        try {
            ResultSet rs = st.executeQuery(query);          
            while(rs.next()){
                accName = rs.getString(getStr);
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

    public Boolean SubmitCompanyData(String ownerName, String companyName, String address, int Vat, String mail, int phone, String username, String psw) {
        System.out.println(ownerName +" "+ companyName +" "+ address +" "+ Vat +" "+ mail +" "+ phone +" "+ username +" "+ psw);
        
        query = "Insert into company values"+
                "('"+ companyName +"','"+ ownerName +"','"+ mail +"','"+ address +"','"+ phone +"','"+ username +"','"+ psw +"','"+ 
                Vat+"','"+"CID"+"')";
        try {      
            st.executeUpdate(query);
            return true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Boolean loginCredentials(String uname,String psw){
        String sqlUname = "";
        String sqlPsw = "";
        query = "select * from  company";
        try {
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                if(!rs.getString("username").equals("") && !rs.getString("u_password").equals("")){
                     sqlUname = rs.getString("username");
                sqlPsw = rs.getString("u_password");
                }
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if( (sqlUname.equals(uname) && sqlPsw.equals(psw))){
            return true;
        }else{
          //  System.out.println("SqlUsername\t:" + sqlUname+"Username\t:" + uname+"Password\t:" + psw+"SqlPsw\t:" + sqlPsw);
        return false;
        }
              
    }
    
    public String companyName(){
        String name = "";      
        query = "select * from  company";
        try {
            ResultSet rs = st.executeQuery(query);          
            while(rs.next()){
                name = rs.getString("c_name");               
            }
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return name;
    }
    
    public int TransactionCount(String dc,String fid){
        query = "select count(*) from ledger where "+ dc +"='" + fid +"';";
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
    
    public double TransactionTotalAmount(String dc,String fid, java.util.Date date1, java.util.Date date2){
        double amount = 0.0;
        
            query = 
                "select * from ledger where ("+ dc +"='" + fid +"' AND (t_date >= '"+date1+"' AND t_date<= '"+date2+"'))";
        
        // System.out.println(query);
        try {
            ResultSet rs = st.executeQuery(query);
           // System.out.println(date1+"hii"+date2);
            while(rs.next()){
                amount = amount + rs.getDouble("amount");
                System.out.println(rs.getDouble("amount")+"hii");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return amount;
    }
    
    
    public String transactionAccName(String id){
        query = "select * from main where ledger_id = '"+id+"'" ;
        String name = "";
        
        try {
            ResultSet rs = st.executeQuery(query);
             while(rs.next()){
                 name = rs.getString("ledger_name");
            }
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        return name;
        
    }

  


}
