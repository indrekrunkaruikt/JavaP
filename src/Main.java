import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String studentName = "";
        String studentNumber = "";
        while(true){
            System.out.println("Name: ");
            studentName = reader.nextLine();
            System.out.println("studentNumber: ");
            studentNumber = reader.nextLine();
            if(studentName == "" ){
                for (Student StudentItem : list) {
                    System.out.println(StudentItem);
                }
                break;
            } else{
                list.add( (new Student(studentName, studentNumber)));
            }
        }
    }
}
