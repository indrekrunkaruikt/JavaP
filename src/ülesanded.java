import java.util.Scanner;

public class ülesanded {
    // Exercise 41
    private static void quessingGame(int randomNumber) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(inputNumber.nextLine());
        if(randomNumber == number){
            System.out.print("Congratulations, your guess is correct!\n");
        }else if (randomNumber < number){
            System.out.print("It is smaller\n");
        }else{
            System.out.print("It is bigger\n");
        }

    }

    public static void main(String[] args) {
        int randomNumber = (int)(100.0 * Math.random());

        quessingGame(randomNumber);
        System.out.print(randomNumber);

    }
}
