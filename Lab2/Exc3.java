package Lab2;

import java.util.Scanner;

public class Exc3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        double r;
        double T;
        double G = 6.67428E-11;
        double pi = 3.142;
        
        System.out.println("\t\t--------------Sun Mass Calculator-----------\n\n");
        
        System.out.print("Please enter the radius of the planet's orbit around the sun: ");
        r = input.nextDouble();
        if (r <= 0 ){
            System.out.println("Error! The radius of the orbit must be positive .... quitting program now");
            System.exit(0);
        }

        System.out.print("Please enter the period of rotation for the planet in days: ");
        T = input.nextDouble();
        if (T <= 0 ){
            System.out.println("Error! The radius of the orbit must be positive .... quitting program now");
            System.exit(0);
        }

        double s = T*86400;
        double m = (4*(pi*pi)*(r*r*r))/(G*(s*s));

        System.out.println(String.format("There are %.0f seconds in %s days",s,T));
        System.out.println(String.format("The approximate mass of the sun is %.0f kg",m));

    }
}
