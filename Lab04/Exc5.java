package Lab04;

import java.util.Scanner;

public class Exc5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean isBinary = true;

        System.out.print("Please enter a piece of text: ");
        String binary = input.nextLine();

        for (int x=0; x<binary.length(); x++){

            char character = binary.charAt(x);

            if (character != '0' && character != '1'){
                isBinary = false;
            }
        }

        if(isBinary){
            System.out.println("\nYou entered a binary number");
        }
        else{
            System.out.println("\nYou did not enter a binary number");
        }
    }
}
