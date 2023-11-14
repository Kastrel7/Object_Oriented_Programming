package Lab05;

import javax.swing.*;

public class Exc5 {

    public static void main(String[] args){
        String hex = JOptionPane.showInputDialog("Please enter your value");
        if (isValidHexadecimal(hex)){
            JOptionPane.showMessageDialog(null, String.format("The decimal equivalent of %s is %.0f",hex, hexToDecimal(hex)), "Program Results", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "The value you entered is not a 6-character hexadecimal number", "Program Results", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static double hexToDecimal(String hex){


        double decNo = 0, power = 0;

        for(int x = 5; x >= 0; x--){
            char hexNo = hex.charAt(x);
            int hexInt = Character.getNumericValue(hexNo);

            switch (hexNo){
                case 'A':
                    hexInt = 10;
                    break;
                case 'B':
                    hexInt = 11;
                    break;
                case 'C':
                    hexInt = 12;
                    break;
                case 'D':
                    hexInt = 13;
                    break;
                case 'E':
                    hexInt = 14;
                    break;
                case 'F':
                    hexInt = 15;
                    break;
                default:
                    break;
            }
            decNo = decNo + (hexInt * Math.pow(16, power));
            power++;
        }
        return decNo;
    }

    public static boolean isValidHexadecimal(String hex){
        int x;
        if(hex.length() == 6){
        boolean bool = false;
            for (x = 0; x < hex.length(); x++) {
                char chr = hex.charAt(x);
                if ("ABCDEF".indexOf(chr) == -1 && !Character.isDigit(chr)) {
                    break;
                }
            }
            if (x==hex.length()){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }

    }
}
