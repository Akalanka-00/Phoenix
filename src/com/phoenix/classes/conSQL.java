/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phoenix.classes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    
    public String retrieveAccId(String l_name){
        String id = "";
         query = "select ledger_id from  main where ledger_name = '"+l_name+"'";
        
        try { 
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                id = rs.getString("ledger_id");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public String retrieveAccNameByID(String id){
        String name = "";
        query = "select * from  main where ledger_id = '"+id+"'";
        
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
    public List<String> retrieveAccData(String id, String col,String cd){
        List<String> dataList = new ArrayList<>();
        query = "select * from  ledger where "+cd+" = '"+id+"'";
        
        try {
            ResultSet rs = st.executeQuery(query);
             while(rs.next()){
                     dataList.add(rs.getString(col));
                 
                 
             }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(conSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dataList;
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
    
    public double TransactionTotalAmount(String dc,String fid, String d1, String d2){
        double amount = 0.0;
        
            query = 
                "select * from ledger where ("+ dc +"='" + fid +"') AND t_date BETWEEN '"+d1+"' AND '"+d2+"'";
        
         System.out.println(query);
        try {
            ResultSet rs = st.executeQuery(query);
           // System.out.println(date1+"hii"+date2);
            while(rs.next()){
                amount = amount + rs.getDouble("amount");
                //JOptionPane.showMessageDialog(new JFrame(),amount);  
                //System.out.println(rs.getDouble("amount")+"hii");
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
    
    public String DateDuration(int startYear, int startMonth, int endYear, int endMonth){
        String dates = "";
        int tempYear = startYear;
        int tempMonth = startMonth;
        String months[] = {"January","February"," March"," April"," May"," June ","July ","August ","September"," October"," November"," December"};
        
        while (true){
            
            if(tempYear==endYear && tempMonth==endMonth){
                break;
            }
            
            if(tempMonth==12){
                tempMonth=0;
                tempYear++;                
            }
            tempMonth++;
            if(dates!=""){
            dates = dates+" OR t_date LIKE '%" + months[tempMonth-1].substring(0, 3) +" % "+ tempYear+"'" ;
            }else{
             dates = dates+"AND ( t_date LIKE '%" + months[tempMonth-1].substring(0, 3) +" % "+ tempYear+"'" ;
            }
            
        }
        if(dates!="")
        dates = dates + ")";
       // System.out.println(dates);
        return dates;
    }

  


}
