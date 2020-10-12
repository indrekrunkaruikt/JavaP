public class CashRegister {
    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // the price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
        if( cashGiven >= 2.50){
            this.cashInRegister = this.cashInRegister + 2.50;
            this.economicalSold = this.economicalSold + 1;
            double giveBackCash = cashGiven - 2.50;
            return giveBackCash;
        }else{
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        // the price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to the register
        //    the amount of the sold lunches is incremented by one
        //    the method returns cashGiven - lunch price
        // if not enough money is given, all is returned and nothing else happens
        if( cashGiven >= 4.00){
            this.cashInRegister = this.cashInRegister + 4.00;
            this.gourmetSold = this.gourmetSold + 1;
            double giveBackCash = cashGiven - 4.00;
            return giveBackCash;
        }else{
            return cashGiven;
        }
    }
    public boolean payEconomical(LyyraCard card) {
        if(card.pay(2.50)) {
            this.economicalSold = this.economicalSold + 1;
            return true;
        }else{
            return false;
        }
    }
    public boolean payGourmet(LyyraCard card) {
        if(card.pay(4.00)) {
            this.gourmetSold = this.gourmetSold + 1;
            return true;
        }else{
            return false;
        }
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
        // ...
        card.loadMoney(sum);
    }
    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
