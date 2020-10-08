import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ülesanded {

    // Exercise 60: Words in alphabetical order

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();

        while(true){
            System.out.print("Type a word: ");
            Scanner reader = new Scanner(System.in);
            String text = reader.nextLine();
            Collections.sort(words);
            if ( words.contains(text) ) {  // could also be: word.equals("")
                for (String word : words) {
                    System.out.println( word );
                }
                break;
            }
            words.add(text);

        }
    }}





