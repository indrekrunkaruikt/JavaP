import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
        // Ülesanne 19 Create a program that gives the course grade based on the following table.
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("HOW OLD ARE YOU: ");
        int number = Integer.parseInt(inputNumber1.nextLine());

        if (number > 0 && number < 125) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

        System.out.println(number);
    }
}
