public class Main {
    public static void main(String[] args) {
        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter minutes = new BoundedCounter(59);


        int i = 0;
        while ( i < 121 ){
            System.out.println("Time: " + hours +":"+ minutes);
            if(minutes.getValue() == 0){
                hours.next();
            }
            minutes.next();

            i++;
        }
    }
}