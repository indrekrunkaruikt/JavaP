import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(100, false);
        counter.increase(20);
        counter.value();
        counter.decrease(20);
        counter.value();
    }
}