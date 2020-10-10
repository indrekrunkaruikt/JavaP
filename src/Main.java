import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();

        System.out.println("Type a number: ");
        while (true){
            int inputNumber =  Integer.parseInt(reader.nextLine());
            stats.addNumber(inputNumber);
            if(inputNumber == -1){
                break;
            }
            if((inputNumber %2)==0){
                evenStats.addNumber(inputNumber);
            } else{
                //number is odd in Java
                oddStats.addNumber(inputNumber);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());
    }
}
