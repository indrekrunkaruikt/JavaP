import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<String, String>();
        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");
        for (String i : nicknames.keySet()) {
            if(i == "matti"){
                System.out.println("key: " + i + " value: " + nicknames.get(i));
            }
        }
    }
}