import java.util.Scanner;

public class ülesanded {

    public static void main(String[] args) {
        // Ülesanne
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.print("Add a year to be calculated: ");
        double number = Integer.parseInt(inputNumber1.nextLine());


        int numberBackInYearForm = (int)number;
        boolean isDivisibleBy100 = number % 100 == 0;
        boolean isDivisibleBy400 = number % 400 == 0;
        boolean LeapYear = number % 4 == 0;
        boolean IsALeapYear = false;

        if(LeapYear)
            {
                if( isDivisibleBy100)
                {
                    if (isDivisibleBy400)
                        IsALeapYear = true;
                    else
                        IsALeapYear = false;
                }
                else
                    IsALeapYear = true;
            }
            else {
                IsALeapYear = false;
            }

        System.out.print("\n is divisible by 4 " + LeapYear + "\n is divisible by 100 " + isDivisibleBy100 + "\n Is divisible by 400 " + isDivisibleBy400);
        System.out.print("\n IS it a leapyear:" + IsALeapYear);
    }
}
