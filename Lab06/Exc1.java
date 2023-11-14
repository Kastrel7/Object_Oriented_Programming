package Lab06;

import javax.swing.*;

public class Exc1 {
    public static void main(String[] args){
        String text = "The valid ISBNs entered are:\n\n";
        String start = "";
        String ISBN = JOptionPane.showInputDialog("Please enter an ISBN (return to exit)");
        while (true){
            if (ISBN.equals("")){
                break;
            }
            else if (isValidISBN(ISBN)){
                if ((ISBN).startsWith("865")){
                    start = start + ISBN + "\n";
                }
                text = text + String.format("%s\n", ISBN);
                ISBN = JOptionPane.showInputDialog("Please enter another ISBN (return to exit)");
                continue;
            }
        }
        JOptionPane.showMessageDialog(null, text + "\n\nThe ISBNs that begin with 865 are:\n\n" + start, "Valid ISBNs", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean goldenRule(String ISBN){
        int mult = 10, sum = 0, charInt = 0;

        for (int x = 0; x < 9; x++) {
            char currentCharacter = ISBN.charAt(x);
            charInt = Character.getNumericValue(currentCharacter);
            sum = sum + (charInt*mult);
            System.out.println(String.format("%s  %s\n",mult, sum));
            mult--;
        }
        sum = sum%11;

        charInt = Character.getNumericValue(ISBN.charAt(9));
        switch (ISBN.charAt(9)) {
            case 'X':
                charInt = 10;
                break;
            case 'x':
                charInt = 10;
                break;
            default:
                break;
        }
        System.out.println(charInt);
        if (11-sum == charInt){
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean isValidISBN(String ISBN){
        while (true) {
            if (ISBN.length() != 10) {
                ISBN = JOptionPane.showInputDialog("Invalid! ISBN must have exactly 10 characters. Please re-enter");
                continue;
            } else if (!(ISBN.substring(0, 9)).matches("\\d+")) {
                ISBN = JOptionPane.showInputDialog("Invalid! First 9 characters must be digits. Please re-enter");
                continue;
            } else if ("Xx".indexOf(ISBN.charAt(9)) == -1 && !Character.isDigit(ISBN.charAt(9))) {
                ISBN = JOptionPane.showInputDialog("Invalid! Last character must be a digit, an 'X' or an 'x'. Please re-enter");
                continue;
            } else if (!goldenRule(ISBN)) {
                ISBN = JOptionPane.showInputDialog("Invalid! ISBN fails the golden rule. Please re-enter");
                continue;
            }
            else{
                break;
            }
        }
        return true;
    }
}
