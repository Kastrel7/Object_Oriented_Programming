package Lab6;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.OptionalDouble;

public class Exc4 {
    public static void main(String[] args){
        double[] nums = {22.3, 45.6, 27.4, 56.6, 73.2, 11.5, 87.4, 23.8};
        String text = String.format("The largest value in the array is %s\nThe average value in the array is %s\nThe list of values above the average is: %s", largest(nums), average(nums), aboveAverage(nums));
        JOptionPane.showMessageDialog(null, text, "Array Stats", JOptionPane.INFORMATION_MESSAGE);

    }

    public static double largest(double[] nums){
        double max = nums[0];
        for (int x = 0; x < nums.length; x++){
            if (nums[x] > max){
                max = nums[x];
            }
        }
        return max;
    }

    public static double average(double[] nums){
        double sum = Arrays.stream(nums).sum();
        return sum/nums.length;
    }

    public static String aboveAverage(double[] nums){
        String aboveAvg = "";
        for (int x = 0; x < nums.length; x++){
            if (nums[x] > average(nums)){
                aboveAvg = aboveAvg + nums[x] + " ";
            }
        }
        return aboveAvg;
    }
}
