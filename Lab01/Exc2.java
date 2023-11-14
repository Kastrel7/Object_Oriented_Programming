package Lab01;

import java.util.Scanner;

public class Exc2 {

    public static void main(String[] args){

        double orbitalSpeed = 13.07367;
        String planetName;
        int noMoons;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the name of the planet: ");
        planetName = input.nextLine();

        System.out.print(String.format("Please enter the number of moons around "+planetName+": "));
        noMoons = input.nextInt();

        System.out.println("\n\n\t\t+++++++++++++++++++++++++++\n"+
                "\t\t\t\tPlanet Data\n"+
                "\t\t+++++++++++++++++++++++++++\n");

        System.out.println(String.format("%-20s%s\n%-20s%.3f%s\n%-20s%s",
                "Planet name:",planetName,
                "Orbital Speed",orbitalSpeed," km/s",
                "Number of Moons",noMoons));
    }
}
