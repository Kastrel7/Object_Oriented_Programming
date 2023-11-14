package Lab03;

import java.util.Scanner;

public class Exc1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double fahrenheit = 0, celcius = 0, avgC = 0, percC = 0;
        int noOfConvs = 0, cBelow = 0, cAbove = 0;

        while (fahrenheit >= -459.67 ){

            System.out.print("Please enter the first Fahrenheit temperature (below -459.67 to exit): ");
            fahrenheit = input.nextDouble();

            celcius = (5f / 9 * ((fahrenheit) - 32));

            System.out.println(String.format("The equivalent Celcius temperature is %.3f\n",celcius));

            noOfConvs++;
            avgC += celcius;

            if (celcius > 30) {
                cAbove++;
            } else if (celcius < 10) {
                cBelow++;
            }

            if (celcius >= 20) {
                percC++;
            }

        }
        noOfConvs --;
        avgC = avgC - celcius;
        cBelow --;
        if (noOfConvs > 0) {
            double avg = avgC / noOfConvs;

            double perc = percC / noOfConvs * 100;

            System.out.println("===========================\n" +
                    "\t\tProgram Results\n" +
                    "===========================\n");
            System.out.println(String.format("Total conversions performed: %s\n" +
                            "Average Celcius temperature: %.3fC\n" +
                            "Total Celcius temperatures > 30C: %s\n" +
                            "Total Celcius temperatures < 10C: %s\n" +
                            "Percentage Celcius temperatures >= 20C: %.0f%%",
                    noOfConvs, avg, cAbove, cBelow, perc));
        }
        else {
            System.out.println("No conversions were performed....Goodbye");
        }


    }
}
