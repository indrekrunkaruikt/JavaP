import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dictionary {
    HashMap<String, String> dictionary = new HashMap<String, String>();
    public String translate(String word){
       String translatedWord = dictionary.get(word);
       return translatedWord;
    }
    public void add(String word, String translation){
        dictionary.put(word, translation);
    }
    public int amountOfWords(){
        int listSize = dictionary.size();
        return listSize;
    }
    public List<String> translationList(){
        List<String> list = new ArrayList<>();
        for ( String key : dictionary.keySet() ) {
            list.add(key+" = "+dictionary.get(key));
        }
        return list;
    }
}
