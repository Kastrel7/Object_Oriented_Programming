package Lab1;

import java.util.Scanner;

public class Exc5 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double ge = 9.81;

        double Mp;
        double Me;
        double re;
        double rp;

        System.out.print("Please enter the mass of the planet Earth: ");
        Me = input.nextDouble();

        System.out.print("Please enter the radius of the Earth: ");
        re = input.nextDouble();

        System.out.print("Please enter the mass of the other planet: ");
        Mp = input.nextDouble();

        System.out.print("Please enter the radius of the other planet: ");
        rp = input.nextDouble();

        double gravP = (ge*Mp*re*re)/(Me*rp*rp);

        System.out.println(String.format("The acceleration due to gravity on the other planet is %.2fm/s/s",gravP));
    }
}
