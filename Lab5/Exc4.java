package Lab5;

import javax.swing.*;

public class Exc4 {

    public static String pointLocator(double xc, double yc, double rad, double x2, double y2){

        double dist = Math.sqrt( Math.pow((x2-xc),2) + Math.pow((y2-yc),2) );


        String location;

        if (dist > rad){
            location = "outside";
        }
        else if (dist == rad){
            location = "on";
        }
        else{
            location = "inside";
        }
        return location;
    }

    public static void main(String[] args){

        double xc = Double.parseDouble(JOptionPane.showInputDialog("Please enter the x co-ordinate of the circle's centre"));

        double yc = Double.parseDouble(JOptionPane.showInputDialog("Please enter the y co-ordinate of the circle's centre"));

        double rad = Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius of the circle"));

        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the x co-ordinate of the second point"));

        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter the y co-ordinate of the second point"));

        JOptionPane.showMessageDialog(null, String.format("The second point is located %s the circle",pointLocator(xc,yc, rad, x2, y2)), "Point Locator", JOptionPane.INFORMATION_MESSAGE);
    }
}
