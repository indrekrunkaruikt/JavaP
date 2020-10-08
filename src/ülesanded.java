import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ülesanded {

    // Exercise 62: Remove last
    public static void removeLast(ArrayList<String> list) {
        Integer numberOfWords = 0;
        for (String word : list) {
            numberOfWords = numberOfWords +1;
        }
        list.remove(0);
    }
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

        // sorting brothers
        Collections.sort(brothers);

        // removing the last item
        removeLast(brothers);

        System.out.println(brothers);
    }}





