package Lab7;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Exc1 {

    public static void main(String[] args){
        Random rand = new Random();
        int num;
        int[] first5 = new int[5], luckyStars = new int[2];
        boolean alreadyPickedFirst5, alreadyPickedLuckyStars;

        for (int x = 0; x < 5; x++){
            alreadyPickedFirst5 = true;
            num = rand.nextInt(1,51);
            for (int y = 0; y < 5; y++){
                if (first5[y] == num){
                    alreadyPickedFirst5 = false;
                    break;
                }
            }
            if (!alreadyPickedFirst5){
                x--;
            }
            else{
                first5[x] = num;
            }
        }

        for (int x = 0; x < 2; x++){
            alreadyPickedLuckyStars = true;
            num = rand.nextInt(1,51);
            for (int y = 0; y < 5; y++){
                if (first5[y] == num){
                    alreadyPickedLuckyStars = false;
                    break;
                }
            }
            for (int y = 0; y < 2; y++){
                if (luckyStars[y] == num){
                    alreadyPickedLuckyStars = false;
                    break;
                }
            }
            if (!alreadyPickedLuckyStars){
                x--;
            }
            else{
                luckyStars[x] = num;
            }
        }


        JOptionPane.showMessageDialog(null, String.format("Winning numbers are: %s\nLucky Stars: %s", Arrays.toString(first5), Arrays.toString(luckyStars)), "Euromillions Results", JOptionPane.INFORMATION_MESSAGE);
    }
}