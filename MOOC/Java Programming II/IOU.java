import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debt;

    //Constructors
    public IOU(){
        this.debt = new HashMap<>();
    }

    //Methods
    public void setSum(String toWhom, double amount){
        debt.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        if (!(debt.containsKey(toWhom))){
            return 0;
        }

        return debt.get(toWhom);
    }
}
