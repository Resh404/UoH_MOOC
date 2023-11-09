import java.util.ArrayList;

public class Room {
    private String code;
    private int numberOfSeats;
    private ArrayList<PersonV2> personList;

    public Room(String code, int numberOfSeats){
        this.code = code;
        this.numberOfSeats = numberOfSeats;
    }
    public Room(){
        this.personList = new ArrayList<>();
    }

    public void add(PersonV2 person){
        this.personList.add(person);
    }
    public boolean isEmpty(){
        if (this.personList.isEmpty()){
            return true;
        }

        return false;
    }
    public ArrayList<PersonV2> getPersons(){
        return this.personList;
    }
    public PersonV2 shortest(){
        if (this.personList.isEmpty()){
            return null;
        }

        int shotPerson = this.personList.get(0).getHeight();
        PersonV2 testing = this.personList.get(0);

        for (int i = 0; i < this.personList.size(); i++){
            if (this.personList.get(i).getHeight() < shotPerson){
                shotPerson = this.personList.get(i).getHeight();
                testing = this.personList.get(i);
            }
        }

        return testing;
    }
    public PersonV2 take(){
        if (personList.isEmpty()){
            return null;
        }

        PersonV2 popShoty = this.shortest();
        this.personList.remove(popShoty);

        return popShoty;
    }
}
