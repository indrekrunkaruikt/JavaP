import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
        // Ülesanne 30

        int number = 1;
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Up to how high? : ");
        int inputNumberMain = Integer.parseInt(inputNumber.nextLine());

        while (number <= inputNumberMain) {

                System.out.println(number);
            number++;  // number++ means the same as number = number + 1

        }
    }
}
