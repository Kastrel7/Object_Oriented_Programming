package Lab7;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Exc4 {
    public static void main(String[] args){
        int[] test = new int[100];
        populateArray(test);
        displayArray(test);
        sortArray(test);
        displayArray(test);
        JOptionPane.showMessageDialog(null, String.format("The percentage of values that exceed 100 is %d%%", over100(test)));
        int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number for which you wish to check its existence within the array"));
        if (binarySearch(test, num)){
            JOptionPane.showMessageDialog(null, String.format("%d was found in the array",num), "Number Found", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, String.format("%d was not found in the array", num), "Number not found", JOptionPane.INFORMATION_MESSAGE);
        }

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number for which you wish to check its number of occurrences within the array"));
        JOptionPane.showMessageDialog(null, String.format("%d appears %d times in the array",num2, numberCount(test, num2)), String.format("Number of occurrences of %d", num2), JOptionPane.INFORMATION_MESSAGE);
    }

    public static void populateArray(int[] test){
        Random rand = new Random();
        for (int x = 0; x < 100; x++){
            test[x] = rand.nextInt(1, 1001);
        }
    }

    public static void displayArray(int[] test){
        JTextArea textArea = new JTextArea(10, 10);
        textArea.setFont(new Font("monospaced", Font.PLAIN, 12));
        String text = "";
        for (int x = 0; x < 100; x++){
            text += String.format("%-5s", test[x]);
            if ((x+1)%10 == 0){
                text += "\n";
            }
        }
        textArea.setText(text);
        JOptionPane.showMessageDialog(null, textArea, "Array Contents", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void sortArray(int[] test){
        int subSmallest, temp;
        for (int x = 0; x < test.length; x++){
            subSmallest = x;

            for (int y = x + 1; y < test.length; y++)
                if (test[y] < test[subSmallest])
                    subSmallest = y;

            temp = test[x];
            test[x] = test[subSmallest];
            test[subSmallest] = temp;
        }
    }

    public static int over100(int[] test){
        int over100 = 0;
        for (int x = 0; x < test.length; x++){
            if (test[x] > 100){
                over100++;
            }
        }
        System.out.printf("%d",over100);
        return over100;
    }

    public static boolean binarySearch(int[] test, int num){
        boolean bool = false;

        for (int x = 0; x < test.length; x++){
            if (test[x] == num){
                bool = true;
                break;
            }
        }

        return bool;
    }

    public static int numberCount(int[] test, int num){
        int found = 0;
        for (int x = 0; x < test.length; x++){
            if (num == test[x]){
                found++;
            }
        }
        return found;
    }
}
