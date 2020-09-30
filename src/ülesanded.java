import java.util.Scanner;

public class ülesanded {
    // Ülesanne 39.1
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
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
