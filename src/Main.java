import java.util.Scanner;

public class Main{
    int nullvalue = 0;
    public static void main(String[] args) {
        int i = 10;

        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}