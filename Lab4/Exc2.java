package Lab4;

import java.util.Scanner;

public class Exc2 {

    public static void main(String[] args){

        int num;
        int finalNum = 0;

        for(int x=0; x<=20; x++){

            int oldNum = finalNum;
            num = x;
            finalNum = num + oldNum;

        }
        System.out.print(String.format("The sum of the first 20 posistive intergers is %d",finalNum));

    }
}
