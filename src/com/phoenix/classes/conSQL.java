/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phoenix.classes;

import java.sql.*;

/**
 *
 * @author Lucifer
 */
public class conSQL {
    public Connection conn;
    public Statement st;   

    public static void main(String args[]) {
        //  conSQL sql = new conSQL();
        //  sql.startDBConnection();
        //  sql.rowCount();
        // sql.accNames(0);
    }

    public void startDBConnection() {
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/pheonix";
        String dClass = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(dClass);
            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();
//            String query = "Select * from accountlist";
//            ResultSet rs = st.executeQuery(query);
//            
//            while (rs.next()) {
//                System.out.println(rs.getString("name"));
//            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error available : " + e);
        }

    }

    public int rowCount() {
        
        return 15;
    }

    public String accNames(int r) {
        return "item " + r;
    }

    public String accTitle(int r) {
        return "Title " + r;
    }

    public String accDiscription(int r) {
        return "Discription " + r;
    }

    public void SubmitCompanyData(String ownerName, String companyName, String address, int Vat, String mail, int phone, String username, String psw) {
        System.out.println(ownerName + companyName + address + Vat + mail + phone + username + psw);
    }
    
    public Boolean loginCredentials(String uname,String psw){
        return true;
    }

}
