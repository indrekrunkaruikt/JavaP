import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ülesanded {

    // Exercise 69: Palindrome
    public static boolean palindrome(String text) {
        String reverseText = "";
        int i = text.length()-1;
        while(i >= 0){
            char symbol = text.charAt(i);
            reverseText += symbol;
            i--;
        }
        System.out.println(reverseText + " " + text);
        if(reverseText != text){
            return true;
        } else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }

    }
}




