package Lab4;

import java.util.Scanner;

public class Exc4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("What number do you wish to display the times-table for? ");
        int num = input.nextInt();

        while (true){

            if (num>0 && num<=12) {
                System.out.println(String.format("\n\n=====The %d times table=====\n", num));

                for (int x = 0; x <= 12; x++) {
                    int mult = num * x;

                    System.out.println(String.format("%d time %d is %d", num, x, mult));
                }
                break;
            }
            else{
                System.out.print("\nInvalid. You must enter a value from 1-12. Please re-enter: ");
                num = input.nextInt();
            }
        }

    }
}
