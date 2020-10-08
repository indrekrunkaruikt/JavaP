public class Main {
    public static void main(String[] args) {
        Menu cafee = new Menu();
        cafee.addMeal("Turkey");
        cafee.addMeal("oyster");
        cafee.addMeal("banana");

        cafee.printMeals();

        cafee.clearMenu();

        cafee.printMeals();

    }
}
