/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phoenix.DataModels;

/**
 *
 * @author Lucifer
 */
public class AccountData {
    
    private int id;
    private String Accname;
    private String AccType;
    private String Discription;
    private String Date;
    
    public static void main (String args[])
    {
    
        AccountData acd = new AccountData();
    }
    
   /* public AccountData(int id, String Accname, String AccType, String Discription, String Date){
        
        this.id=id;
        this.Accname = Accname;
        this.AccType = AccType;
        this.Discription = Discription;
        this.Date = Date;
        
    }*/
    
    public void setName(){this.Accname= Accname;}
    
    public String getName(){return this.Accname;}
}

