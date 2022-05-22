/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phoenix.classes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucifer
 */
public class DataValidation {
    
    public static void main (String args[]){
    
    }
    
    public Boolean RepasswordValid(String psw1, String psw2){
        return psw1.equals(psw2);        
        
    }
     
    public Boolean Validation(String ownerName, String companyName, String address, String Vat, String mail, String phone, String username, String psw1, String psw2){

        if(ownerName.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Owner Name."); 
            return false;
        }else if(companyName.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Company Name."); 
            return false;
        }else if(address.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Address."); 
            return false;
        }else if(Vat.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Vat no."); 
            return false;
        }else if(mail.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Email."); 
            return false;
        }else if(phone.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Phone number.");
            return false;
        }else if(username.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Username."); 
            return false;
        }else if(psw1.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Password."); 
            return false;
        }else if(psw2.trim().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(),"Please enter the Re-password."); 
            return false;
        }else{
            if(RepasswordValid(psw1, psw2)){
                JOptionPane.showMessageDialog(new JFrame(),"Valied.");
                return true;
            }else{
                JOptionPane.showMessageDialog(new JFrame(),"Re-password is not same!!");
                return false;
            }
             
        }
        
    }

    
    
}
