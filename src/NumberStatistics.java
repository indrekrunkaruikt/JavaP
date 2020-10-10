public class NumberStatistics {
    private int amountOfNumbers;
    private int sumOfNumbers = 0;
    private int sumOfEven = 0;
    private int sumOfOdd = 0;
    public NumberStatistics() {
        // initialize here the object variable amountOfNumber
    }

    public void addNumber(int number) {
        // code here
        this.sumOfNumbers = this.sumOfNumbers + number;
        this.amountOfNumbers = this.amountOfNumbers + 1;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
    public int sum() {
        // code here
        return this.sumOfNumbers;
    }
    public double average() {

        // code here
        return (double)this.sum()/ this.amountOfNumbers();
    }
}
