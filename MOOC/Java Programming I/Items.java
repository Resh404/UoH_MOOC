import java.util.Date;

public class Items {
    private String name;
    Date date = new Date();
    public Items(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return ("Name: " + this.name + " (created at: " + this.date + ")");
    }
}
