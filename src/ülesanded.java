import java.util.Scanner;

public class ülesanded {
    // Exercise 53: First part
    public static void main(String[] args) {

        Scanner inputWord = new Scanner(System.in);
        System.out.print("Type a word : ");
        String word = inputWord.nextLine();

        Scanner inputLength = new Scanner(System.in);
        System.out.print("Type the number of words that come from the beginning : ");
        int number = inputLength.nextInt();

        System.out.println(word.substring(0, number));

    }}


