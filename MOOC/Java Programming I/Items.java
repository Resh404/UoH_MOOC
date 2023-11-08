import java.util.Date;

public class Items {
    private String name;
    private String id;
    private Date date = new Date();
    public Items(String name){
        this.name = name;
    }
    public Items(String id, String name){
        this.id = id;
        this.name = name;
    }
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Items)){
            return false;
        }

        Items comparedCast = (Items) compared;

        if (this.id.equals(((Items) compared).id)){
            return true;
        }

        return false;
    }
    @Override
    public String toString(){
        //return ("Name: " + this.name + " (created at: " + this.date + ")");
        return ("Ex15: " + this.id + ": " + this.name);
    }
}
