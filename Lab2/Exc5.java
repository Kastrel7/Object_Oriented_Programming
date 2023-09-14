package Lab2;

import java.util.Scanner;

public class Exc5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String Char;

        System.out.print("Please enter a single keybaord character: ");
        Char = input.nextLine();

        if (Char.length() != 1){
            System.out.println("Error! The value entered must contain exactly one character");
            System.exit(0);
        }
    }
}
