public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1999);
        Person steve = new Person("Thomas", 1, 3, 1961);

        System.out.println( steve.getName() + " age " + steve.age() + " years");
        System.out.println( pekka.getName() + " age " + pekka.age() + " years");
    }
}
