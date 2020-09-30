import java.util.Scanner;

public class ülesanded {
    // Exercise 39.4: Printing a left-aligned triangle
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
    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
        public static void main(String[] args) {
        printTriangle(4);
    }
}
