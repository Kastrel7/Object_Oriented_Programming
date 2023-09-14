package Lab1;

import java.util.Scanner;

public class Exc4 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double R = 8.3145;
        float T;
        int n;
        float P;
        
        System.out.println("========Volume Calculator========\n\n");
        
        System.out.print("Please enter the temperature of the gas: ");
        T = input.nextFloat();
        
        System.out.print("Please enter the number of moles of the gas: ");
        n = input.nextInt();
        
        System.out.print("Please enter the pressure of the gas: ");
        P = input.nextFloat();
        
        double V = (n*R*T)/P;
        
        System.out.println(String.format("\nThe volume of the gas is %.3f m³",V));
        
        
    }
}
