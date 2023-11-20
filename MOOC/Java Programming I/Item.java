import java.util.Date;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Item)){
            return false;
        }

        Item comparedCast = (Item) compared;

        if (this.name.equals(((Item) compared).name)){
            return true;
        }

        return false;
    }
    @Override
    public String toString(){
        return (this.name + " (" + this.weight + " kg)");
    }
}