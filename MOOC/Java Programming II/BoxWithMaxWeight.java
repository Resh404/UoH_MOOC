import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int maxW;
    private int currW;
    private ArrayList<ItemV3> items;

    //Constructors
    public BoxWithMaxWeight(int maxW){
        this.maxW = maxW;
        this.currW = 0;
        this.items = new ArrayList<>();
    }

    //Methods
    @Override
    public void add(ItemV3 item) {
            if (item.getWeight() <= (this.maxW - this.currW)){
                this.currW += item.getWeight();
                items.add(item);
            } else {
                return;
            }
        }

    @Override
    public boolean isInBox(ItemV3 item){
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).getName().equals(item.getName())){
                return true;
            }
        }
        return false;
    }

}

