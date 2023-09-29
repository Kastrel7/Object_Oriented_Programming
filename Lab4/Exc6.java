package Lab4;

import javax.swing.*;
import java.awt.*;

public class Exc6 {

    public static void main(String[] args){

        JTextArea textArea = new JTextArea(14,30);

        Font textAeraFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setText(String.format("%-35s%-26s%-40s%s\n" +
                "%-35s%-26s%-40s%s\n",
                "Name","T-Number","Course","Avg Mark",
                "====","========","======","========"));

        for (int x=1;x<=5;x++){
            String name = JOptionPane.showInputDialog(String.format("Please enter the name of student %d",x));
            String tNumber = JOptionPane.showInputDialog(String.format("Please enter the t-number of student %d",x));
            String course = JOptionPane.showInputDialog(String.format("Please enter the course of student %d",x));
            String avgMarkAsString = JOptionPane.showInputDialog(String.format("Please enter the average mark of student %d",x));

            double avgMark = Double.parseDouble(avgMarkAsString);

            textArea.append(String.format("\n%-35s%-26s%-40s%.2f",name,tNumber,course,avgMark));
        }

        JOptionPane.showMessageDialog(null, textArea, "Formatted Data", JOptionPane.PLAIN_MESSAGE);
    }
}
