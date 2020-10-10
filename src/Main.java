import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(0, false);
        counter.value();
        counter.decrease();
        counter.value();
        counter.increase();
        counter.value();
    }
}