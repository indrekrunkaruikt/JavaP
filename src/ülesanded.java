import java.util.Scanner;

public class ülesanded {
    public static void main(String[] args) {
        // Ülesanne 36

        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Type the number of points: ");
        int number = Integer.parseInt(inputNumber.nextLine());

        while(true){
            if(number != -1){
                number = Integer.parseInt(inputNumber.nextLine());
            } else {
                break;
            }
        }

    }
}
