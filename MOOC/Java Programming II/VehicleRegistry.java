import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> lp;

    //Constructors
    public VehicleRegistry(){
        this.lp = new HashMap<>();
    }

    //Methods
    public boolean add(LicensePlate licensePlate, String owner){
        String freeCar = lp.get(licensePlate);

        if (freeCar == null){
            lp.put(licensePlate,owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate){
        if (lp.get(licensePlate).equals(null)){
            return null;
        }

        return lp.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if (!(lp.get(licensePlate).isEmpty())){
            lp.remove(licensePlate,lp.get(licensePlate));
            return true;
        }

        return true;
    }

    public void printLicensePlates(){
        for (LicensePlate in : lp.keySet()){
            System.out.println(in);
        }
    }

    public void printOwners(){
        ArrayList<String> temp = new ArrayList<>();

        for (String in : lp.values()){
            if (!temp.contains(in)){
                System.out.println(in);
                temp.add(in);
            }
        }
    }
}
