public class Counter {
    private int value;   // object variable that remembers the value of the counter3
    public Counter(int startingValue,  boolean check) {
        if(check) {
            this.value = startingValue;
        }else if(!check && startingValue >= 0){
            this.value = startingValue;
        }else{
            this.value = 0;
        }
    }
    public void value() {
        System.out.println("value: " + this.value);
    }
    public void increase() {
        // write here the code that decrements the value of counter by one
            this.value++;
    }
    public void increase(int increaseAmount) {
        // write here the code that decrements the value of counter by one
        if(increaseAmount <= 0){
            this.value = this.value;
        }else {
            this.value = this.value + increaseAmount;
        }
    }
    public void decrease() {
        // write here the code that decrements the value of counter by one
            this.value--;
    }
    public void decrease(int decreaseAmount) {
        // write here the code that decrements the value of counter by one
        if(decreaseAmount <= 0){
            this.value = this.value;
        }else {
            this.value = this.value - decreaseAmount;
        }
    }
    public void reset(){
        this.value = 0;
    }
    // and here the rest of the methods
}
