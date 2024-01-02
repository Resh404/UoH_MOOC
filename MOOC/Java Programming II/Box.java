import java.util.ArrayList;

public abstract class Box {

    //Constructors
    //Methods
    public abstract void add(ItemV3 item);

    public void add(ArrayList<ItemV3> items) {
        for (ItemV3 item : items) {
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(ItemV3 item);
}
/*
    private String name;
    private int weight;
    public Box(String name, int weight){
        this.name = name;
        this.weight = weight;
    } */