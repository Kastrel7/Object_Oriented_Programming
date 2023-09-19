package Lab3;

import java.util.Scanner;

public class Exc2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sent;

        System.out.print("Please enter a sentence terminated with a full-stop or exclamation mark:\n");
        sent = input.nextLine();

        char current = sent.charAt(0);

        while (current != '.' || current != '!'){

        }
        System.out.println(sent);
    }
}
