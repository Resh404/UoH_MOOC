import java.util.*;

public class Stacked {
    private ArrayList<String> str;

    public Stacked(){
        this.str = new ArrayList<>();
    }

    public boolean isEmpty(){
        if (!str.isEmpty()){
            return false;
        }

        return true;
    }
    public void add(String value){
        str.add(0, value);
    }
    public ArrayList<String> values(){
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.size(); i++){
            list.add(str.get((str.size()-1)- i));
        }

        return list;
    }
    public String take(){
        String newestVal = str.get(0);
        str.remove(0);

        return newestVal;
    }
}
