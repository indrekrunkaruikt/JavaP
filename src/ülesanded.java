import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
	// Ülesanne 14
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(inputNumber.nextLine());

        System.out.println("You typed " + number);


        if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

    }
}
