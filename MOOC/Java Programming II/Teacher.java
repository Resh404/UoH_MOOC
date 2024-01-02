public class Teacher extends PersonV3{
    private int pay;

    //Constructor
    public Teacher(String name, String addr, int pay){
        super(name, addr);
        this.pay = pay;
    }

    //Methods
    @Override
    public String toString(){
        return (this.name + "\n" + "  " + this.addr + "\n" + "  salary " + this.pay + " euro/month");
    }
}
