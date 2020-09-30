import java.util.Scanner;

public class ülesanded {
    // Exercise 39.3: Printing a rectangle
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
        for (int i = 1; i <= sideSize; i++) {
            printStars(sideSize);
        }
    }
    private static void printRectangle(int aSideSize, int bSideSize) {
        for (int i = 1; i <= bSideSize; i++) {
            printStars(aSideSize);
        }
    }
    public static void main(String[] args) {
        printRectangle(7, 2);
    }
}
