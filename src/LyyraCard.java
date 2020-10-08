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
        if(balance > 2.50){
            this.balance = this.balance - 2.50;
        }
        // write code here
    }

    public void payGourmet() {
        if(balance > 4.00){
            this.balance = this.balance - 4.00;
        }
    }
    public void loadMoney(double amount) {
        if(this.balance < amount){
            this.balance = this.balance + amount;
        } else {
            this.balance = this.balance;
        }
    }

}
