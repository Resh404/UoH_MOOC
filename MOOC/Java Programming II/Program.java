import java.util.HashMap;
import java.util.Set;

public class Program {


    //Constructors
    //Methods
    public static void printKeys(HashMap<String,String> hashmap){
        for (String key : hashmap.keySet()){
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key : hashmap.keySet()){
            if (key.contains(text)){
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String key : hashmap.keySet()){
            if (key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }

    public static void printValues(HashMap<String,BookV3> hashmap){
        for (BookV3 book : hashmap.values()){
            System.out.println(book);
        }
    }

    public static void printValueIfNameContains(HashMap<String,BookV3> hashmap, String text){
        for (String key : hashmap.keySet()){
            if (key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }
}
