import java.util.ArrayList;

public class PersonV3 {
    protected String name;
    protected String addr;

    //Constructor
    public PersonV3(String name, String addr){
        this.name = name;
        this.addr = addr;
    }

    //Methods
    public static void printPersons(ArrayList<PersonV3> persons){
        for (PersonV3 in : persons){
            System.out.println(in);
        }
    }

    @Override
    public String toString(){
        return (this.name + "\n" + "  " + this.addr);
    }
}
