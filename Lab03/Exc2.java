package Lab03;

import java.util.Scanner;

public class Exc2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a sentence terminated with a full-stop or exclamation mark:\n\n");
        String sent = input.nextLine();

        char oldChar = '.';
        int charCount = 0, vowelCount = 0, digitCount = 0, oddCount = 0, consCount = 0;

        for (int x = 0; x < sent.length(); x++){

            char current = sent.charAt(x);

            while ((current != '.') && (current != '!')){
                charCount ++;

//                System.out.println(current);

                if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u' ||
                        current == 'A' || current == 'E' || current == 'I' || current == 'O' || current == 'U'){
                    vowelCount ++;
                }
                if (Character.isDigit(current)){
                    digitCount ++;
                }
                if (Character.isDigit(current) && current%2 == 1){
                    oddCount ++;
                }

                if (current == oldChar){
                    consCount ++;
                }

                oldChar = current;

                break;
            }
        }

        System.out.println("\n--------------------------------\n" +
                "\t\tSentence Analysis\n" +
                "--------------------------------");
        System.out.println(String.format("Total characters: %s\n" +
                "Total vowels: %s\n" +
                "Total digits: %s\n" +
                "Total odd number characters: %s\n" +
                "Times a character appears consecutively: %s",
                charCount, vowelCount, digitCount, oddCount, consCount));
    }
}
