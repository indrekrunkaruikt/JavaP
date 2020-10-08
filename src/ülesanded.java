import java.util.Scanner;
import java.util.ArrayList;

public class ülesanded {

    // Exercise 57: Words

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        while(true){
            System.out.print("Type a word: ");
            Scanner reader = new Scanner(System.in);
            String text = reader.nextLine();
            words.add(text);
            if ( text.isEmpty() ) {  // could also be: word.equals("")
                for (String word : words) {
                    System.out.println( word );
                }
                break;
            }

        }
    }}


