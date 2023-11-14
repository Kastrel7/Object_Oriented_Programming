package Lab02;

import java.util.Scanner;

public class Exc5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String str;
        char chr;

        System.out.print("Please enter a single keyboard character: ");
        str = input.nextLine();

        if (str.length() != 1){
            System.out.println("Error! The value entered must contain exactly one character");
            System.exit(0);
        }
        else {
            chr = str.charAt(0);
            if (Character.getType(chr) == 1) {
                System.out.println("The category of the character you entered is: uppercase letter");
            }
            else if (Character.getType(chr) == 2) {
                System.out.println("The category of the character you entered is: lowercase letter");
            }
            else if (Character.getType(chr) == 26) {
                System.out.println("The category of the character you entered is: currency symbol");
            }
            else if (Character.getType(chr) == 24) {
                System.out.println("The category of the character you entered is: punctuation symbol");
            }
            else if (Character.getType(chr) == 12) {
                System.out.println("The category of the character you entered is: whitespace character");
            }
        }
    }
}
