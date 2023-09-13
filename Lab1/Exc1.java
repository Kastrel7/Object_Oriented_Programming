package Lab1;

import java.util.Scanner;

public class Exc1 {

    public static void main(String[] args) {

        String investment1;
        int shares1;
        double sharePrice1;

        String investment2;
        int shares2;
        double sharePrice2;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the type of the first investment: ");
        investment1 = input.nextLine();

        System.out.print("Please enter the number of shares purchased: ");
        shares1 = input.nextInt();

        System.out.print("Please enter the share price: ");
        sharePrice1 = input.nextDouble();

        System.out.print("\n\nPlease enter the type of the second investment: ");
        investment2 = input.nextLine();
        investment2 = input.nextLine();

        System.out.print("Please enter the number of shares purchased: ");
        shares2 = input.nextInt();

        System.out.print("Please enter the share price: ");
        sharePrice2 = input.nextFloat();

        System.out.println("\n\n\t\t\t===============================\n"+
                            "\t\t\t\tInvestment Details\n"+
                            "\t\t\t===============================\n\n");

        System.out.println(String.format("%-20s%-10s%s\n%-20s%-10s%s",
                "Investment Fund","# Shares","Share Price",
                "---------------","--------","-----------"));

        System.out.println(String.format("%-20s%-10s%.4f\n%-20s%-10s%.4f",
                investment1,shares1,sharePrice1,
                investment2,shares2,sharePrice2));
    }
}
