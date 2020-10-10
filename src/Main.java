import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(4);
        System.out.println("Password: " + randomizer.createPassword());

        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());

    }
}
