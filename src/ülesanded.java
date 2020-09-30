import java.util.Scanner;

public class ülesanded {
    // Exercise 44

    public static int least(int number1, int number2, int number3) {
        return  Math.min(Math.min(number1, number2), number3);
    }

    public static void main(String[] args) {
        int answer =  least(2, 7, 3);
        System.out.println("Least: " + answer);
    }

}
