import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<ItemV3> items;

    //Constructors
    public OneItemBox(){
        this.items = new ArrayList<>();
    }

    //Methods
    @Override
    public void add(ItemV3 item){
        if (this.items.isEmpty()){
            this.items.add(item);
        } else {
            return;
        }
    }

    @Override
    public boolean isInBox(ItemV3 item){
        if (this.items.get(0).getName().equals(item.getName())){
            return true;
        } else {
            return false;
        }
    }
}
