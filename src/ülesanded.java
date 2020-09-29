import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
        // Ülesanne 32

        int number = 1;
        int result = 0;
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Up to how high? : ");
        int inputNumberMain = Integer.parseInt(inputNumber.nextLine());

        while (number <= inputNumberMain) {

            result = result + number;
            number++;  // means the same as i = i + 1;
        }
        System.out.println(result);
    }
}
