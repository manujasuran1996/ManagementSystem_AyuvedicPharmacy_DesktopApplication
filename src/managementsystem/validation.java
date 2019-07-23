/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementsystem;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.regex.*;


/**
 *
 * @author KALINDU
 */
public class validation {
    
    
 private static Component rootPane;    
    
  
    
    
    public static boolean isValidID(String id){
        /*
        Validate NIC no
        */
       char c;
       if(id.charAt(9)== 'V' || id.charAt(9)== 'v'){
       for(int i = 0; i<9; i++){
          c = id.charAt(i);
          if (Character.isDigit(c)) {               
                    return true;
       }
          else{
              JOptionPane.showMessageDialog(rootPane,"Enter A Valid NIC number");
              return false;
          }
       }
       }
       JOptionPane.showMessageDialog(rootPane,"Enter A Valid NIC number");
       return false; 
    }

    public static boolean isValidName(String name) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (!Character.isLetter(c)) {
                JOptionPane.showMessageDialog(rootPane,"Enter Charactors only in Name Field");
                return false;
                
            }
        }
        return true;
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        /*
        Validate Phonenumber
        */
        if (!(phoneNumber.length() == 10)) {
            JOptionPane.showMessageDialog(rootPane,"Enter 10 Digits Only For Phone Number");
            return false;
        } else {
            char c;
            for (int i = 0; i < phoneNumber.length(); i++) {
                c = phoneNumber.charAt(i);
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(rootPane,"Enter Digits Only For Phone Number");
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValidAccNo(String accno){
    
        if(!(accno.length()== 12)){
            JOptionPane.showMessageDialog(rootPane, "Enter a correct Account number!");
            return false;
        }else{
            char c;
            for(int i=0;i<accno.length();i++){
                c=accno.charAt(i);
                if(!Character.isDigit(c)){
                    JOptionPane.showMessageDialog(rootPane,"Enter a correct Account number!");
                    return false;
                }    
            }
        }
        return true;
    }
    public static boolean isValidEmail(String email){
        /*
        Validate Email
        mihiranga1996@gmail.com
        kalindu.wijekoon@my.sliit.lk
        */
           String ePattern = "^[a-zA-Z0-9./]{1,50}@[a-zA-Z0-9./]{1,50}.[a-zA-Z]{2,3}$";
           Pattern p = Pattern.compile(ePattern);
           Matcher m = p.matcher(email);
           if(m.find() && m.group().equals(email)){
            return true;
           }else{
                JOptionPane.showMessageDialog(rootPane,"Email Is Invalid!");
               return false;
           }
           
           
    }
    
    public static boolean isValidBankName(String name) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (!Character.isLetter(c)) {
                JOptionPane.showMessageDialog(rootPane,"Enter Charactors only in Bank Name Field");
                return false;
                
            }
        }
        return true;
    }
    
    
    public static boolean isValidAccName(String name) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (!Character.isLetter(c)) {
                JOptionPane.showMessageDialog(rootPane,"Enter Charactors only in Account type Field");
                return false;
                
            }
        }
        return true;
    }
    
    
    public static boolean isValidID1(String id) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < id.length(); i++) {
            c = id.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane,"Enter Digits only in id Field");
                return false;
                
            }
        }
        return true;
    }
    
    public static boolean isValidIncome(String id) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < id.length(); i++) {
            c = id.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane,"Enter Digits only in income Field");
                return false;
                
            }
        }
        return true;
    }
    
    
    
    
     public static boolean isValidName1(String name) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (!(Character.isLetter(c) || Character.isSpace(c))) {
                
                return false;
                
            }
        }
        return true;
    }
     
     
     
      public static boolean isValidID2(String id) {
        /*
        Validate Name
        */
        char c;
        for (int i = 0; i < id.length(); i++) {
            c = id.charAt(i);
            if (!Character.isDigit(c)) {
                
                return false;
                
            }
        }
        return true;
    }
      public static boolean notEmptyDate(Date date){
          if(date==null){
              JOptionPane.showMessageDialog(rootPane,"Date field cannot be empty");
              return false;
          }else
              return true;
      
      }
      public static boolean notEmptyDate(Date date,Date date2){
          if(date==null || date2==null){
              JOptionPane.showMessageDialog(rootPane,"Date fields cannot be empty");
              return false;
          }else
              return true;
      
      }
      public static boolean correctDate(Date date){
          SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
          //given date partitioning
          String dte = df.format(date);
          String dateyear;
          dateyear = dte.substring(0,4);
          String datemonth;
          datemonth = dte.substring(5,7);
          String datedate;
          datedate = dte.substring(8);
          //today's date partitioning
          String today = df.format(new Date());
          String todaysyear;
          todaysyear=today.substring(0,4);
          String todaysmonth;
          todaysmonth= today.substring(5,7);
          String todaysdate;
          todaysdate =today.substring(8);
          //converting to int
          int datetoday,monthtoday,yeartoday,dategiven,monthgiven,yeargiven;
          dategiven=Integer.parseInt(datedate);
          monthgiven=Integer.parseInt(datemonth);
          yeargiven=Integer.parseInt(dateyear);
          datetoday=Integer.parseInt(todaysdate);
          monthtoday=Integer.parseInt(todaysmonth);
          yeartoday=Integer.parseInt(todaysyear);
     
     return (dategiven>=datetoday && yeargiven>=yeartoday && monthgiven>=monthtoday) || (yeargiven>yeartoday &&(datetoday>=dategiven || dategiven>datetoday));
      }
      

}



