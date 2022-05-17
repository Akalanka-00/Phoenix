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
    
    
    
    public static void main (String args[]){
    
    conSQL sql = new conSQL();
    sql.startDBConnection();

    }
    
    public void startDBConnection(){
          
        String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL";
    String dClass = "com.mysql.cj.jdbc.Driver";

  try {
     Class.forName(dClass);
     Connection conn = DriverManager.getConnection(url);
     Statement st = conn.createStatement();
     String query = "Select * from accountlist";
     ResultSet rs = st.executeQuery(query);
     
     while (rs.next()){
         System.out.println(rs.getString("name"));
     }
        } catch (Exception e) {
           System.out.println("error available");
        }

    }

    

}
