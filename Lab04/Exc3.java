package Lab04;

import java.util.Scanner;
public class Exc3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the upper limit: ");
        int limit = input.nextInt();

        int num;
        int finalNum = 0;

        for(int x=0; x<=limit; x++){

            int oldNum = finalNum;
            num = x;
            finalNum = num + oldNum;

        }
        System.out.print(String.format("The sum of the first 20 posistive intergers is %d",finalNum));

    }
}
