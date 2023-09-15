package Lab2;

import java.util.Scanner;

public class Exc6 {

    public static boolean checkSameDigits(int digit){

        if (digit == 55555 || digit == 66666 || digit == 77777 || digit == 88888 || digit == 99999){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int digit, choice;
        double digitperc;

        System.out.print("Please enter a 5-digit positive whole number: ");
        digit = input.nextInt();

        if (String.valueOf(digit).length() != 5){
            System.out.println("You have not entered a valid 5 digit number, exiting program now ......");
            System.exit(0);
        }

        System.out.println("\n\n\t\t1. Determine 1.25% of the number\n" +
                "\t\t2. Determine if the number exceeds 50000 and contains all the same digits\n" +
                "\t\t3. Determine if the number is odd or even\n" +
                "\t\t4. Determine the first digit in the number\n\n");

        System.out.print("Please enter your choice: ");
        choice = input.nextInt();


        switch (choice){
            case 1:
                digitperc = digit*0.0125;
                System.out.println(String.format("\n\n1.25%% of the number entered is %.0f", digitperc));
                break;
            case 2:
                if (digit > 50000 && !checkSameDigits(digit)){
                    System.out.println("\n\nThe number you entered does exceed 50000 and does not contain all the same digits");
                }
                else if ((digit <= 50000 && !checkSameDigits(digit))){
                    System.out.println("\n\nThe number you entered does not exceed 50000 and does not contain all the same digits");
                }
                else if ((digit > 50000 && checkSameDigits(digit))){
                    System.out.println("\n\nThe number you entered does exceed 50000 and does contain all the same digits");
                }
                break;
            case 3:
                int oddeven = digit%2;
                if (oddeven == 0){
                    System.out.println("\n\nThe number you entered is even");
                }
                else {
                    System.out.println("\n\nThe number you entered is odd");
                }
                break;
            case 4:
                char first = String.valueOf(digit).charAt(0);
                System.out.print(String.format("\n\nThe first digit in the number is %s", first));
                break;
        }
    }
}
