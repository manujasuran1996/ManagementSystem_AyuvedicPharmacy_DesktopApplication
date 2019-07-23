package managementsystem.patientpkg;

import java.awt.Component;
import javax.swing.JOptionPane;
import java.util.regex.*;

public class validation1 extends Appointment {

    private static Component rootPane;

    public static boolean isValidName(String name) {
        /*
        Validate Name
         */
        char c;
        for (int i = 0; i < name.length(); i++) {
            c = name.charAt(i);
            if (!Character.isLetter(c)) {
                JOptionPane.showMessageDialog(rootPane, "Enter Charactors only in Name Field");
                return false;

            }
        }
        return true;
    }

    public static boolean isValidAge(String age) {
        /*
        Validate Age
         */
        char c;
        for (int i = 0; i < age.length(); i++) {
            c = age.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane, "Enter Digits only in Age Field");
                return false;

            }
        }
        return true;
    }

    public static boolean isValidAppointments(String no) {
        /*
        Validate No Of Appointments
         */
        char c;
        for (int i = 0; i < no.length(); i++) {
            c = no.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane, "Enter Digits only in No Of Appointments Field");
                return false;

            }
        }
        return true;
    }

    public static boolean isValidPid(String no) {
        /*
        Validate PID
         */
        char c;
        for (int i = 0; i < no.length(); i++) {
            c = no.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane, "Enter Digits only in PID Field");
                return false;

            }
        }
        return true;
    }

    public static boolean isValidPhoneNumber(String phone) {
        /*
        Validate Phonenumber
         */
        if (!(phone.length() == 10)) {
            JOptionPane.showMessageDialog(rootPane, "Enter 10 Digits Only For Phone Number");
            return false;
        } else if (!(phone.charAt(0) == '0')) {
            JOptionPane.showMessageDialog(rootPane, "Phone Number First Digit Must Be A 0");
            return false;
        } else if (!(phone.charAt(1) == '7')) {
            JOptionPane.showMessageDialog(rootPane, "Phone Number Second Digit Must Be A 7");
            return false;
        } else if (!(phone.charAt(2) == '0' || phone.charAt(2) == '1' || phone.charAt(2) == '2' || phone.charAt(2) == '5' || phone.charAt(2) == '6' || phone.charAt(2) == '7' || phone.charAt(2) == '8')) {
            JOptionPane.showMessageDialog(rootPane, "Phone Number Trird Digit Must Be One Of 0,1,2,5,6,7,8");
            return false;
        } else {
            char c;
            for (int i = 0; i < phone.length(); i++) {
                c = phone.charAt(i);
                if (!Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(rootPane, "Enter Digits Only For Phone Number");
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean Pidvalidation(String pid) {

        if (pid.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "PID field cannot be empty!");
        }
        return false;
    }

    public static boolean Timevalidation(String time) {
        if (time.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Time field cannot be empty!");
        }
        return true;
    }

    public static boolean isValidDfee(String dfee) {
        char c;
        for (int i = 0; i < dfee.length(); i++) {
            c = dfee.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane, "Enter Digits Only For Doctor Fee Field");
                return false;
            }
        }
        return true;
    }

    public static boolean isValidchanelfee(String chanelfee) {
        char c;
        for (int i = 0; i < chanelfee.length(); i++) {
            c = chanelfee.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane, "Enter Digits Only For Chanel Fee Field");
                return false;
            }
        }
        return false;
    }

    public static boolean isValidNoOfApp(String no) {
        char c;
        for (int i = 0; i < no.length(); i++) {
            c = no.charAt(i);
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(rootPane, "Enter Digits Only For No Of Appointment Field");
                return false;
            }
        }
        return false;
    }

    public static boolean isValidphn(String phone) {

        if (phone.charAt(0) != 0) {
            JOptionPane.showMessageDialog(rootPane, "Phone Number First Digit Must Be A 0");
            return false;
        } else if (phone.charAt(1) != 7) {
            JOptionPane.showMessageDialog(rootPane, "Phone Number Second Digit Must Be A 7");
            return false;
        } else if (phone.charAt(2) != 0 || phone.charAt(2) != 1 || phone.charAt(2) != 2 || phone.charAt(2) != 5 || phone.charAt(2) != 6 || phone.charAt(2) != 7 || phone.charAt(2) != 8) {
            JOptionPane.showMessageDialog(rootPane, "Phone Number Trird Digit Must Be One Of 0,1,2,5,6,7,8");
            return false;
        }
        return true;

    }
    /*public static boolean isValidLLL(String phone){
    
    int[] arr = new int[3];
    
}*/
}
