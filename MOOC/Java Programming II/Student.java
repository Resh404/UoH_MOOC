public class Student extends PersonV3{
    private int credit;

    //Constructors
    public Student(String name, String addr){
        super(name,addr);
        this.credit = 0;
    }

    //Methods
    public void study(){
        this.credit++;
    }

    public int credits(){
        return this.credit;
    }

    @Override
    public String toString(){
        return (this.name + "\n" + "  " + this.addr + "\n" + "  Study credits " + this.credit);
    }
}
