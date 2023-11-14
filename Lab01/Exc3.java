package Lab01;

import java.util.Scanner;

public class Exc3 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int ounces;
        
        System.out.print("Please enter the total number of ounces: ");
        ounces = input.nextInt();
        
        int lbs = ounces/16;
        int ozs = ounces%16;
        
        System.out.println("\n"+ounces+"lbs is equivalent to "+lbs+"lbs "+ozs+"oz");
        
    }
}
