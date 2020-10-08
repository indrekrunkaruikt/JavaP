public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        String message = "The card has "+ this.balance +" euros";
        return message;
    }
    public void payEconomical() {
        // write code here
        this.balance = this.balance - 2.50;
    }

    public void payGourmet() {
        // write code here
        this.balance = this.balance - 4.00;

    }
}
