import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> unt;

    //Constructors
    public StorageFacility(){
        this.unt = new HashMap<>();
    }
    //Methods
    public void add(String unit, String item){
        this.unt.putIfAbsent(unit, new ArrayList<>());
        this.unt.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if (this.unt.get(storageUnit) == null){
            return new ArrayList<>();
        }

        return this.unt.get(storageUnit);
    }

    public void remove(String storageUnit, String item){
        this.unt.get(storageUnit).remove(item);

        if (this.unt.get(storageUnit).isEmpty()){
            this.unt.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> allUnits = new ArrayList<>();
        allUnits.addAll(this.unt.keySet());

        return allUnits;
    }
}
