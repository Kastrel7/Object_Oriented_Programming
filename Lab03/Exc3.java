package Lab03;

import java.util.Scanner;

public class Exc3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int charCount = 0, letterCount = 0, digitCount = 0, wordCount = 0, puncCount = 0, sentCount = 0;

        System.out.println("Please enter your line of text: \n\n");
        String sent = input.nextLine();

        for (int x = 0; x < sent.length(); x++){
            char current = sent.charAt(x);

            charCount ++;

            if (Character.isAlphabetic(current)){
                letterCount ++;
            }
            else if (Character.isDigit(current)){
                digitCount ++;
            }

            if (current == ' '){
                wordCount ++;
            }

            if (".!'".indexOf(current) != -1){
                puncCount ++;
                sentCount ++;
            }
        }

        wordCount ++;

        System.out.println("\n\n============================================\n" +
                "\t\tLexical Analysis of Your Text\n" +
                "============================================\n\n");

        System.out.println(String.format("Characters: %d\n" +
                "Letters: %d\n" +
                "Digits: %d\n" +
                "Words: %d\n" +
                "Sentences: %d\n" +
                "Punctuation symbols: %d",
                charCount, letterCount, digitCount, wordCount, sentCount, puncCount));

    }
}
