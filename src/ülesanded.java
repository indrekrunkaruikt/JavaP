import java.util.Scanner;

public class ülesanded {
    // Exercise 41


    public static void main(String[] args) {
        int randomNumber = (int)(100.0 * Math.random());
        while(true){
                Scanner inputNumber = new Scanner(System.in);
                System.out.print("Type a number: ");
                int number = Integer.parseInt(inputNumber.nextLine());
                if(randomNumber == number){
                    System.out.print("Congratulations, your guess is correct!\n");
                    break;
                }else if (randomNumber < number){
                    System.out.print("It is smaller\n");
                }else{
                    System.out.print("It is bigger\n");
                }


        }

    }
}
