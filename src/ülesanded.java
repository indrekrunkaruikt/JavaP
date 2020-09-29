import java.util.Scanner;

public class ülesanded {
    public static void main(String[] args) {
        // Exercise 36.3: Summing and counting the numbers
        int sumResult = 0;
        int sumCount = 0;
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Type the number of points: ");
        int number = Integer.parseInt(inputNumber.nextLine());

        while(true){
            if(number != -1){
                sumCount +=1;
            sumResult = sumResult + number;
            number = Integer.parseInt(inputNumber.nextLine());
            }
            else {
                break;
            }
         }
        System.out.print(sumResult + "\n");
        System.out.print(sumCount);
    }
}
