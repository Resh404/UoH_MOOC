public class PersonV2 {

    private String name;
    private int age;
    private int weight;
    private int height;
    private SimpleDate birthday;
    private Pet pet;

    public PersonV2(String name) {
        this(name, 0, 0, 0);
    }

    public PersonV2(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public PersonV2(String name, Pet pet){
        this.name = name;
        this.pet = pet;
    }
    public PersonV2(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }
    public PersonV2(String name, SimpleDate date, int weight , int height) {
        this.name = name;
        this.birthday = date;
        this.weight = weight;
        this.height = height;
    }

    public PersonV2(String nam, int day, int month, int year, boolean t) {
        t = true;
        this.name = nam;
        this.birthday = new SimpleDate(day, month, year);
    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }
    public int getWeight(){
        return this.weight;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
    public boolean equals (Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof PersonV2)){
            return false;
        }

        PersonV2 comparedCast = (PersonV2) compared;

        if (this.name.equals(((PersonV2) compared).name) && this.birthday.equals(((PersonV2) compared).birthday)
                && this.weight == ((PersonV2) compared).weight && this.height == ((PersonV2) compared).height){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        //return this.name + ", age " + this.age + " years";
        return ("Ex10: " + this.name + " has a friend called " + pet.getName() + " (" + pet.getBreed() + ")");
    }
}