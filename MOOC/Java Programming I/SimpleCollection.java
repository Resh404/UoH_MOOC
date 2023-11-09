import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> simList;
    private int simCounter;

    public SimpleCollection(String name){
        this.name = name;
        this.simList = new ArrayList<>();
        this.simCounter = 0;
    }

    public String getName(){
        return this.name;
    }
    public void add(String str){
        simCounter++;
        this.simList.add(str);
    }
    public String longest(){
        if (this.simList.isEmpty()){
            return null;
        }

        int currLength = 0;
        String longestName = "";
        for (int i = 0; i < this.simList.size(); i++){
            if (this.simList.get(i).length() > currLength){
                currLength = this.simList.get(i).length();
                longestName = this.simList.get(i);
            }
        }
        return longestName;
    }

    @Override
    public String toString(){
        String output = " element";
        if (simCounter > 1){
            output = " elements";
        }

        if (simList.isEmpty()){
            return "The collection " + this.name + " is empty";
        }

        String coll = "";
        for (int i = 0; i < simList.size(); i++) {
            coll = coll + simList.get(i) + "\n";
        }


        return "The collection " + this.name + " has " + this.simCounter
                + output + "\n" + coll;
    }
}
