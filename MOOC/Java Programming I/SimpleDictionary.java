import java.util.HashMap;
import java.util.Map;

public class SimpleDictionary {
    private Map<String, String> dictionary;

    public SimpleDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        } else {
            return "Word (searched word) was not found";
        }
    }
}
