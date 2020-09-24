import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
        // Ülesanne 18 Create a program that gives the course grade based on the following table.
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Type the number of points: ");
        int number = Integer.parseInt(inputNumber1.nextLine());
        if (number == 29 || number <= 29) {
            System.out.println("Your FAILED!!!");
        } else if ( number == 34 || number <=34){
            System.out.println("Your got 1, bad job.");
        } else if ( number == 39 || number <= 39){
            System.out.println("Your got 2, pretty bad job.");
        } else if ( number == 44 || number <= 44){
            System.out.println("Your got 3, not great, not terrible.");
        } else if ( number == 49 || number <= 49){
            System.out.println("Your got 4, pretty good.");
        } else if ( number == 60 || number <= 60 ) {
            System.out.println("You succeeded!");
        };
        System.out.println(number);
    }
}
