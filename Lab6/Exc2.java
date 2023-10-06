package Lab6;

import javax.swing.*;
import java.lang.reflect.Array;

public class Exc2 {
    public static void main(String[] args){
        String text = "The list of valid emails entered is:\n\n";
        for (int x = 0; x < 5; x++){
            String email = JOptionPane.showInputDialog(String.format("Loop %d - Please enter an email value", x+1));
            email = isValidEmail(email);
            text = text + email + "\n";
            continue;
        }
        JOptionPane.showMessageDialog(null, text, "Valid Emails", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String getRecName(String email){
        String[] em = email.split("@");
        return em[0];
    }
    public static String getDomName(String email){
        String[] em = email.split("@");
        String[] emDom = em[1].split("\\.");
        return emDom[0];
    }
    public static boolean dduRec(String email){
        return getRecName(email).matches("^[a-zA-Z0-9]*$") || getRecName(email).contains("-") || getRecName(email).contains(".") || getRecName(email).contains("_");
    }
    public static boolean dduDom(String email){
        return getDomName(email).matches("^[a-zA-Z0-9]*$") || getDomName(email).contains("-") || getDomName(email).contains(".") || getDomName(email).contains("_");
    }

    public static String isValidEmail(String email){
        while (true) {
            if (email.length() < 7 || email.length() > 322) {
                email = JOptionPane.showInputDialog("Invalid! Email value must have between 7 and 322 characters inclusive");
                continue;
            } else if (!email.contains("@")) {
                email = JOptionPane.showInputDialog("Invalid! Email value must contain an @ symbol");
                continue;
            } else if (!email.endsWith(".com") && !email.endsWith(".net") && !email.endsWith(".ie") && !email.endsWith(".org")) {
                email = JOptionPane.showInputDialog("Invalid! Email value must end with .com, .org, .net, or .ie");
                continue;
            } else if (getRecName(email).length() > 64 || getRecName(email).length() <= 0) {
                email = JOptionPane.showInputDialog("Invalid! Recipient name must contain between 1 and 64 characters inclusive");
                continue;
            } else if (!dduRec(email)) {
                email = JOptionPane.showInputDialog("Invalid! Recipient name must only contain letters, digits, dashes, dots, and underscores");
                continue;
            } else if (getDomName(email).length() > 253 || getDomName(email).length() <= 1) {
                email = JOptionPane.showInputDialog("Invalid! Domain name must contain between 2 and 253 characters inclusive");
                continue;
            } else if (!dduDom(email)) {
                email = JOptionPane.showInputDialog("Invalid! Domain name must only contain letters, digits, dashes, dots, and underscores");
                continue;
            } else {
                break;
            }
        }
        return email;
    }
}
