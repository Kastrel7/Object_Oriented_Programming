package Lab02;

import java.util.Scanner;

public class Exc2 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("=================================\n"+"\t\tCar Park Calculator\n"+"=================================\n");

        double totalCost = 0;
        double hrs;

        System.out.print("Please enter the amount of time in hours you spent parking: ");
        hrs = input.nextDouble();

        if(hrs <= 0){
            System.out.println("Error: you have entered an invalid time value ... exiting program");
            System.exit(0);
        } else if (hrs > 0 && hrs <= 1) {
            totalCost = hrs*0.6;
        } else if (hrs > 1 && hrs <= 3) {
            totalCost = ((hrs-1)*.5)+.6;
        } else if (hrs > 3) {
            totalCost = ((hrs-3)*.4)+1.6;
        }


        System.out.println(String.format("Total cost of parking for %s hours is €%.2f",hrs,totalCost));
    }
}
