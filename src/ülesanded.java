import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
        // Ülesanne 22

        String correctPassword = "carrot";
        boolean isPasswordCorrect = false;
        while(!isPasswordCorrect){
            Scanner passwordInput = new Scanner(System.in);
            System.out.print("Type in the password: ");
            String password = passwordInput.nextLine(); // Reads a line of input from the user and assigns it
            if (!(correctPassword.equals(password))) {  // true if the condition text.equals("milk") is false
                System.out.println("Wrong!");
                // System.out.println("Your password is " + password);
            } else {
                System.out.println("Right");
                System.out.println("The secret is: The gold is buried between those 2 stones behind the oak tree.\n");
                // System.out.println("Your password is " + password);
                isPasswordCorrect = true;
            }
        }

    }
}
