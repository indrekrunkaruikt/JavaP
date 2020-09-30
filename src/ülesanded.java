import java.util.Scanner;

public class ülesanded {
    // Exercise 41


    public static void main(String[] args) {
        int randomNumber = (int)(100.0 * Math.random());
        int amountOfGuesses = 1;
        while(true){
                Scanner inputNumber = new Scanner(System.in);
                System.out.print("Type a number: ");
                int number = Integer.parseInt(inputNumber.nextLine());
                if(randomNumber == number){
                    System.out.print("Congratulations, your guess is correct!\n");
                    break;
                }else if (randomNumber < number){
                    System.out.print("It is smaller, guesses made: " + amountOfGuesses  +"\n");
                    amountOfGuesses = amountOfGuesses +1;
                }else{
                    System.out.print("It is bigger, guesses made: " + amountOfGuesses  +"\n");
                    amountOfGuesses = amountOfGuesses +1;
                }


        }

    }
}
