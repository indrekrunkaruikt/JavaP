import java.util.Scanner;

public class ülesanded {
    // Ülesanne 39.2
    private static void printStars(int amount) {
        // you can print one star with the command
        String stars = "";
        for (int i =1; i <= amount; i++) {
            String result = "*";
            stars = stars + result;
        }
        System.out.print(stars + "\n");
        // call this command amount times
    }
    private static void printSquare(int sideSize) {
        int height = 0;
        for (int i = 1; i <= sideSize; i++) {
            printStars(sideSize);
        }
    }
    public static void main(String[] args) {
        printSquare(3);
    }
}
