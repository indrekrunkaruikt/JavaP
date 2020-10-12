import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String studentName = "";
        String studentNumber = "";
        String searchInputValue = "";
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
        System.out.println("Search: ");
        searchInputValue = reader.nextLine();
        while(true){
            for (Student StudentItem : list) {
                if(StudentItem.getName().contains(searchInputValue)){
                    System.out.println(StudentItem);
                }
            }
            break;
        }


    }
}
