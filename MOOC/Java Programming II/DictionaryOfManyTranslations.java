import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> lation;

    //Constructors
    public DictionaryOfManyTranslations(){
        this.lation = new HashMap<>();
    }
    //Methods
    public void add(String word, String translation){
        this.lation.putIfAbsent(word, new ArrayList<>());
        this.lation.get(word).add(translation);

        //ArrayList<String> temp = this.lation.get(word);
        //temp.add(translation);
    }

    public ArrayList<String> translate(String word){
        if (this.lation.get(word) == null){
            return new ArrayList<>();
        }
        return this.lation.get(word);
    }

    public void remove(String word){
        this.lation.get(word).clear();
        this.lation.remove(word);
    }
}
