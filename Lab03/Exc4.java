package Lab03;

import java.util.Scanner;

public class Exc4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float weight = 0, heaviest = 0, lightest = 100000;
        double total = 0, perc = 0;


        for (int x = 1; x <= 5; x++){
            System.out.print(String.format("Please enter the weight of person %d: ",x));
            weight = input.nextFloat();

            total = total + weight;

            if (weight > heaviest){
                heaviest = weight;
            }
            if (weight < lightest){
                lightest = weight;
            }

            if (weight >= 80){
                perc++;
            }
        }

        double avg = total/5f;

        System.out.println("===========================\n" +
                "\t\tProgram Results\n" +
                "===========================\n");
        System.out.printf("Average Weight: %.2fkg\n\n" +
                "Percentage >= 80kg: %.2f%%\n\n" +
                "Heaviest weight: %skg\n\n" +
                "Lightest weight: %skg",
                avg, (perc/5)*100, heaviest, lightest);
    }
}
