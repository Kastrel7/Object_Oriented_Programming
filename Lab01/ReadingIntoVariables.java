package Lab01;

import java.util.Scanner;

public class ReadingIntoVariables {

    public static void main(String[] args){

        String name;
        int age;
        float height;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the name of the student: ");
        name = input.nextLine();

        System.out.print("Please enter the age of the student: ");
        age = input.nextInt();

        System.out.print("Please enter the height of the student: ");
        height = input.nextFloat();

        System.out.println("\n\n*********************************************\n"+
                            "\t\t\tStudent Details\n"+
                            "*********************************************");

        System.out.println("Name: " + name + "\nAge: " + age + " years" + "\nHeight: " +
                            height + "m");
    }
}
