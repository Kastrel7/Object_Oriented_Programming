package Lab3;

import java.util.Scanner;

public class Exc5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a piece of text: ");
        String inp = input.nextLine();

        if ("1234567890".indexOf(inp) == -1){
            System.out.println("You did not enter a positive whole number");
        }
        else{
            System.out.println("You entered a positive whole number");
        }
        
    }
}
