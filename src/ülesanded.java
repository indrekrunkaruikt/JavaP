import java.util.Scanner;


public class ülesanded {

    // Exercise 56: Reversing text
    public static String reverse(String text) {
        String reverseText = "";
        int i = text.length()-1;
        while(i >= 0){
            char symbol = text.charAt(i);
            reverseText += symbol;
            i--;
        }
        return reverseText;
    }

    public static void main(String[] args) {

        System.out.print("Type in your text: ");
        Scanner reader = new Scanner(System.in);
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }}


