package Lab5;

import javax.swing.*;

public class Exc2 {

    public static void main(String[] args){

        String characterAsString = JOptionPane.showInputDialog("Please enter any character");
        char character = characterAsString.charAt(0);

        if (Character.isDigit(character)) {
            JOptionPane.showMessageDialog(null, "You entered a digit", "Digit Test", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "You did not enter a digit", "Digit Test", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
