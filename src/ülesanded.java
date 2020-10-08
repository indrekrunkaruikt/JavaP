import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ülesanded {

    // Exercise 64: Average of numbers
    public static double average(ArrayList<Integer> list) {
        double length = list.size();
        double sum = 0;
        for (Integer number : list) {
            sum = sum + number;
        }
        double average = sum/length;
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println("The average is: " + average(list));
    }
    }





