package Lab3;

import java.util.Scanner;

public class Exc6 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double interest = 100000, rate = 0.03;
        int year = 1;

        while (interest >= 12000){
            interest = (interest+(interest*rate))-12000;
            System.out.println(String.format("Balance at the end of year %d is €%.2f",year,interest));
            year++;
        }
    }
}
