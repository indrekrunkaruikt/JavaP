import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        System.out.println("Type a number: ");
        while (true){
            int inputNumber =  Integer.parseInt(reader.nextLine());
            stats.addNumber(inputNumber);
            if(inputNumber == -1){
                break;
            }
        }
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        /*

        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);

        */
    }
}
