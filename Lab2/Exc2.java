package Lab2;

import java.util.Scanner;

public class Exc2 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=================================\n"+"\t\tCar Park Calculator\n"+"=================================\n");

        double cost = 0;
        double hrs;

        System.out.print("Please enter the amount of time in hours you spent parking: ");
        hrs = input.nextDouble();

        if(hrs <= 0){
            System.out.println("Error: you have entered an invalid time value ... exiting program");
            System.exit(0);
        } else if (hrs > 0 && hrs <= 1) {
            cost = 0.60;
        } else if (hrs > 1 && hrs <= 3) {
            cost = 0.50;
        } else if (hrs > 3) {
            cost = 0.40;
        }


        System.out.println(String.format("Total cost of parking for %s hours is €%.2f",hrs,hrs*cost));
    }
}
