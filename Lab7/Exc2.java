package Lab7;

import javax.swing.*;
import java.awt.*;

public class Exc2 {
    public static void main(String[] args){
        String[] names = {"James Maye", "Joe Bloggs", "John Doe", "Teresa Coughlan", "Sam Stewart"};
        double[] GPAs = {3.56, 2.47, 3.12, 2.55, 2.78};
        selectionSort(names, GPAs);
        displayGPA(names, GPAs);
    }
    public static void displayGPA(String[] names, double[] GPAs){
        String text = String.format("%-20s%-4s\n%-20s%s\n\n", "Name", "GPA", "-----", "----");
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Courier New", Font.PLAIN, 15));
        for (int x = names.length - 1; x >= 0; x--){
            text += String.format("%-20s%-4s\n", names[x], GPAs[x]);
        }
        textArea.setText(text);
        JOptionPane.showMessageDialog(null, textArea, "Sorted Results", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, String.format("The average GPA is %.0f", averageGPA(GPAs)));
        JOptionPane.showMessageDialog(null, String.format("The standard deviation of the GPAs is %.3f", standardDeviationGPA(GPAs)));
    }
    public static void selectionSort(String[] names, double[] GPAs){
        int subSmallest;
        double temp;
        String temp2;
        for (int x = 0; x < GPAs.length; x++){
            subSmallest = x;

            for (int y = x + 1; y < GPAs.length; y++)
                if (GPAs[y] < GPAs[subSmallest])
                    subSmallest = y;
            temp = GPAs[x];
            temp2 = names[x];
            GPAs[x] = GPAs[subSmallest];
            names[x] = names[subSmallest];
            GPAs[subSmallest] = temp;
            names[subSmallest] = temp2;
        }
    }
    public static double averageGPA(double[] GPAs){
        double sum = 0;
        for (int x = 0; x < GPAs.length; x++){
            sum += GPAs[x];
        }
        return sum/GPAs.length;
    }
    public static double standardDeviationGPA(double[] GPAs){
        double sum = 0;
        for (int x = 0; x < GPAs.length; x++){
            sum += Math.pow( (GPAs[x] - averageGPA(GPAs)) , 2);
        }
        double N = 1f/GPAs.length;
        return Math.sqrt( N*sum );
    }
}
