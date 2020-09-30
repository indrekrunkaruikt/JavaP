import java.util.Scanner;

public class ülesanded {
    public static void main(String[] args) {
        // Exercise 36.4: Counting the average
        double sumResult = 0;
        double sumCount = 0;
        double average = 0;
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Type the number of points: ");
        double number = Integer.parseInt(inputNumber.nextLine());

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
        average = sumResult / sumCount;
        System.out.print(sumResult + "\n");
        System.out.print(sumCount  + "\n");
        System.out.print(average  + "\n");
    }
}
