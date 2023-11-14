package Lab02;

import java.util.Scanner;

public class Exc4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String supply;
        String tank;
        String meter;
        int litres = 0;
        double cpl = 0.00224;

        System.out.print("Do you have a private water supply (y or n)? ");
        supply = input.nextLine();
        System.out.print("Do you have a septic tank (y or n)? ");
        tank = input.nextLine();

        if (supply.equals("y") && tank.equals("y")) {
            System.out.println("\nYou are not a customer of Irish Water so your bill is €0.00");
            System.exit(0);
        }
        else if (supply.equals("n") || tank.equals("n")) {
            System.out.print("\nDo you have a water meter installed (y or n)? ");
            meter = input.nextLine();
            if (meter.equals("n")){
                System.out.println("\nYour Annual Bill for Irish Water services is €212.00");
            }
            else if (meter.equals("y")) {
                System.out.print("\nPlease enter the number of litres used last year: ");
                litres = input.nextInt();
                if (litres <= 30000) {
                    System.out.println(String.format("\nYour Annual Bill for Irish Water services is €%.2f", litres * cpl));
                }
                else {
                    System.out.println(String.format("\nYour Annual Bill for Irish Water services is €%.2f", (litres - 30000) * cpl));
                }
            }
        }
    }
}
