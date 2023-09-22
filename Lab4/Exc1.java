package Lab4;

import java.util.Scanner;

public class Exc1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int choice;
        boolean again = true;


        do {
            System.out.print("\t\t============Length Converter============\n\n" +
                    "\t\t1. Convert Inches to Feet and Inches\n" +
                    "\t\t2. Convert Metres to Feet\n" +
                    "\t\t3. Quit\n\n" +
                    "\t\tPlease enter your choice: ");
            choice = input.nextInt();

            while (again) {
                switch (choice) {
                    case 1:
                        while (true) {
                            System.out.print("Please enter a quantity in inches: ");
                            int inches = input.nextInt();

                            if (inches < 0) {
                                System.out.print("Invalid quantity! Must be at least zero. Please re-enter: ");
                                inches = input.nextInt();
                            }
                            else {
                                int feet = inches/12;
                                int newInch = inches%12;

                                System.out.printf("%d inches is equivalent to %d feet %d inches",inches, feet, newInch);
                                break;
                            }
                        }
                        again = false;
                        break;
                    case 2:
                        while (true) {
                            System.out.print("Please enter a quantity in meters: ");
                            double meters = input.nextDouble();

                            if (meters < 0) {
                                System.out.print("Invalid quantity! Must be at least zero. Please re-enter: ");
                                meters = input.nextDouble();
                            } else {
                                double feet = meters * 3.281;

                                System.out.printf("%s meters is equivalent to %.4f feet", meters, feet);
                                break;
                            }
                        }
                        again = false;
                        break;
                    case 3:
                        System.out.print("Thanks for using the length converter .... goodbye");
                        again = false;
                        break;
                    default:
                        System.out.print("\nInvalid choice! Must be 1, 2 or 3. Please re-enter: ");
                        choice = input.nextInt();
                        again = true;
                        break;
                }
            }
            break;
        } while (true);

    }
}
