import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itms;
    private int weight;
    private int itmCount;
    private int totalWeight;

    public Suitcase(int weight){
        this.itms = new ArrayList<Item>();
        this.weight = weight;
        this.itmCount = 0;
        this.totalWeight = 0;
    }

    public void addItem(Item item){
        this.weight = this.weight - item.getWeight();
        if(this.weight >= 0){
            itmCount++;
            totalWeight += item.getWeight();
            itms.add(item);
        } else {
            this.weight = this.weight + item.getWeight();
        }
    }
    public void printItems(){
        if (itms.isEmpty()){
            return;
        }

        String toBeOuted = "";
        for(int i=0; i<itms.size(); i++){
            toBeOuted = (itms.get(i).getName() + " (" + itms.get(i).getWeight() + " kg)");
            System.out.println(toBeOuted);
        }
    }
    public int totalWeight(){
        return totalWeight;
    }
    public Item heaviestItem(){
        if (itms.isEmpty()){
            return null;
        }

        int tempHeavi = itms.get(0).getWeight();
        Item newItem = new Item(itms.get(0).getName(), itms.get(0).getWeight());

        for(int i=0; i<itms.size(); i++){
            if (itms.get(i).getWeight() > tempHeavi){
                tempHeavi = itms.get(i).getWeight();
                newItem = itms.get(i);
            }
        }

        return newItem;
    }

    @Override
    public String toString(){
        String itemFormat = " items";
        if (this.itmCount < 2){
            itemFormat = " item";
        }
        return (itmCount + itemFormat + " (" + this.weight + ")");
    }
}