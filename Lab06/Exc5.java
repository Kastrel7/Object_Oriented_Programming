package Lab06;

import javax.swing.*;

public class Exc5 {
    public static void main(String[] args){
        String[] names = new String[5], phoneNumbers = new String[5];
        populateArrays(names, phoneNumbers);
        String name = JOptionPane.showInputDialog("Whose phone number do you seek?");
        if (linearSearch(names, name) != -1){
            JOptionPane.showMessageDialog(null, String.format("The phone number is %s", phoneNumbers[linearSearch(names, name)]), "Phone Number", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Name not found!", "Phone Number", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void populateArrays(String[] names, String[] phoneNumbers){
        for (int x = 0; x < names.length; x++){
            names[x] = JOptionPane.showInputDialog("Please enter the name of person " + (x+1));
            phoneNumbers[x] = JOptionPane.showInputDialog("Please enter the phone number of person " + (x+1));
        }
    }

    public static int linearSearch(String[] names, String name){
        int val = -1;
        for (int x = 0; x < names.length; x++){
            if (names[x].matches(name)){
                val = x;
                break;
            }
            else{
                continue;
            }
        }
        return val;
    }
}
