import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<String, String>();

        for (String i : nicknames.keySet()) {
            if(i == "matti"){
                System.out.println("key: " + i + " value: " + nicknames.get(i));
            }
        }
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
    }
}