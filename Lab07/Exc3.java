package Lab07;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Exc3 {
    public static void main(String[] args){
        String[] tNums = new String[10], course = new String[10];
        int healthChem = 0, t003 = 0, compt00036 = 0;
        int[] nums = new int[10];
        String text = "";
        populateArrays(tNums, course, nums);
        JOptionPane.showMessageDialog(null, String.format("Before sorting, the contents of the t-numbers and course names arrays are:\n\n%s\n%s",Arrays.toString(tNums), Arrays.toString(course)));
        selectionSort(nums, tNums, course);
        JOptionPane.showMessageDialog(null, String.format("After sorting, the contents of the t-numbers and course names arrays are:\n\n%s\n%s",Arrays.toString(tNums), Arrays.toString(course)));


        binarySearch(tNums, course);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("monospaced", Font.PLAIN, 12));
        textArea.setText(findItems(tNums, course, healthChem, t003, compt00036, text));

        JOptionPane.showMessageDialog(null, textArea, "Student Statistics", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void populateArrays(String[] tNums, String[] course, int[] nums){
//        for (int x = 0; x < 10; x++){
//            tNums[x] = JOptionPane.showInputDialog(String.format("Enter t-number for student %d", x+1));
//            course[x] = JOptionPane.showInputDialog(String.format("Enter course name for student %d", x+1));
//        }
        for (int x = 0; x < tNums.length; x++){
            String[] noT = tNums[x].split("t");
            nums[x] = Integer.parseInt(noT[1]);
        }
    }

    public static void selectionSort(int[] nums, String[] tNums, String[] course){
        int subSmallest, temp;
        String temp2, temp3;
        for (int x = 0; x < nums.length; x++){
            subSmallest = x;

            for (int y = x + 1; y < nums.length; y++)
                if (nums[y] < nums[subSmallest])
                    subSmallest = y;
            temp = nums[x];
            temp2 = course[x];
            temp3 = tNums[x];
            nums[x] = nums[subSmallest];
            course[x] = course[subSmallest];
            tNums[x] = tNums[subSmallest];
            nums[subSmallest] = temp;
            course[subSmallest] = temp2;
            tNums[subSmallest] = temp3;
        }
    }

    public static void binarySearch(String[] tNums, String[] course){
        String seek = JOptionPane.showInputDialog("Enter the t-number of the student you seek");
        boolean found = false;
        for (int x = 0; x < tNums.length; x++){
            if (seek.equals(tNums[x])){
                JOptionPane.showMessageDialog(null, "The t-number you sought was found in the array and the corresponding course name for this student is " + course[x], "Found!", JOptionPane.INFORMATION_MESSAGE);
                found = true;
                break;
            }
            else{
                found = false;
                x++;
            }
        }
        if (!found){
            JOptionPane.showMessageDialog(null, "The t-number you sought was not found in the array", "Not Found!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static String findItems(String[] tNums, String[] course, int healthChem, int t003, int compt00036, String text){
        double perc = 0;
        int[] nums = new int[10];
        for (int x = 0; x < tNums.length; x++){
            String[] noT = tNums[x].split("t");
            nums[x] = Integer.parseInt(noT[1]);
            if (tNums[x].startsWith("t003")){
                t003++;
            }
            if (course[x] == "Health & Leisure" || course[x] == "Chemistry"){
                healthChem++;
            }
            if (course[x] == "Computing" && nums[x] > 36000){
                compt00036++;
            }
            perc = (double) (compt00036 * 100) /10;
        }
        text += String.format("The number of students whose t-number begins with \"t003\" is %d\n" +
                        "The number of students whose course is either \"Health & Leisure\" or \"Chemistry\" is %d\n" +
                        "The percentage of students taking the \"Computing\" course whose t-number is from \"t00036\" onwards is %s%%\n\n" +
                        "The list of t-numbers/course names for students taking \"Mechatronics\",\"Early Childcare\" or \"Computing\"\n\n" +
                        "%-20s%s\n%-20s%s\n\n",
                        t003, healthChem, perc, "T-Number", "Course Name", "--------", "-----------");

        for (int x = 0; x < tNums.length; x++){
            if (course[x] == "Mechatronics" || course[x] == "Early Childcare" || course[x] == "Computing"){
                text += String.format("%-20s%s\n",tNums[x], course[x]);
            }
        }
        return text;
    }
}
