import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ülesanded {

    // Exercise 61: Amount of items in a list
    public static void countItems(ArrayList<String> list) {
        Integer numberOfWords = 0;
        for (String word : list) {
            numberOfWords = numberOfWords +1;
        }
        System.out.println(numberOfWords);

    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();


            list.add("Hallo");
            list.add("Ciao");
            list.add("Hello");
            System.out.println("There are this many items in the list:");
            countItems(list);

    }}





