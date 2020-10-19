import java.util.HashMap;

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
}
