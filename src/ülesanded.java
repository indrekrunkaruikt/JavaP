import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
        // Ülesanne 26

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum = sum + read;
            // DO SOMETHING HERE

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);

    }
}
