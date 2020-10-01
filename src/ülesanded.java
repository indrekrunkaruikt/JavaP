import java.util.Scanner;

public class ülesanded {
    // Exercise 50: Separating first characters
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Type a name : ");
        String name = inputNumber.nextLine();
        int nameLength = name.length();

        for(int i=1;i<=nameLength;i++){
            char character = name.charAt(i);
            System.out.println(i + "character: " + character);

        }

    }}


