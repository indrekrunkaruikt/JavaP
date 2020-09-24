import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
	// Ülesanne 16 Create a program that asks the user for a number and tells whether the number is even or odd.
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(inputNumber1.nextLine());
        if(number % 2 == 0)
            System.out.println(number + " is even");
        else
            System.out.println(number + " is odd");
    }
}
