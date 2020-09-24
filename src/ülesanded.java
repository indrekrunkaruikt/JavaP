import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
	// write your code here
        // ülesanne 1
        System.out.print("Jane Doe \n");
        // Ülesanne 5
        Integer days = 365;
        Integer hours = 24;
        Integer seconds = 60;
        Integer allSecondsInAYear = 365 * 24 * 60;
        System.out.print("There are " + allSecondsInAYear + "Seconds in a year.\n");
        //Ülesanne 9
        Scanner numberInput1 = new Scanner(System.in);
        System.out.print("Type a number A: ");
        int numbera = Integer.parseInt(numberInput1.nextLine());
        Scanner numberInput2 = new Scanner(System.in);
        System.out.print("Type a number B: ");
        int numberb = Integer.parseInt(numberInput2.nextLine());
        double  sumOfNumbers = numbera / numberb;
        System.out.println("The result is: " + sumOfNumbers);
        // Ülesanne 10;
        Double PI = 3.14;
        Scanner inputRadius = new Scanner(System.in);
        System.out.print("Type a number A: ");
        int radius = Integer.parseInt(inputRadius.nextLine());
        double circumference = 2 * PI * radius;
        System.out.println("The diameter is: " + circumference);


    }
}
