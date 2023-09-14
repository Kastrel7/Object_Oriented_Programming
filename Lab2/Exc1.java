package Lab2;

import java.util.Scanner;

public class Exc1 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double V;
        int R1;
        int R2;
        
        System.out.println("*********Current Calculator*********\n");
        
        System.out.print("Please enter the voltage of the battery: ");
        V = input.nextDouble();
        
        if(V <= 0){
            System.out.println("Error! The voltage of the battery must be positive ..... now quitting program");
            System.exit(0);
        }

        System.out.print("Please enter the resistance of the first resistor: ");
        R1 = input.nextInt();

        System.out.print("Please enter the resistance of the second resistor: ");
        R2 = input.nextInt();


        double A = (V*(R1+R2))/(R1*R2);

        System.out.println(String.format("\nThe total current flowing in the circuit is %.0fAmps", A));

    }
}
