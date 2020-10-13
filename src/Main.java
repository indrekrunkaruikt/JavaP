public class Main{
    public static void main(String[] args) {
        int i = -1;
        for (int j = 9; j > i; j--) {
            for (int k = j; k > i; k--) {
                System.out.print(k + " ");
            }
            System.out.print("\n");
        }
    }
}