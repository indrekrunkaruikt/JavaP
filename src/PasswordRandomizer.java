import java.util.Random;

public class PasswordRandomizer {
    // Define the variables here
    String password = "";
    public PasswordRandomizer(int length) {
        int i = 0;
        Random randomizer = new Random();
        while (true){
            int number = randomizer.nextInt(12);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            this.password = this.password  + symbol;
            if(i == length){
                break;
            }
            i++;
        }
    }
    public String createPassword() {
        return password;
        // Write the code here which returns the new password
    }
}