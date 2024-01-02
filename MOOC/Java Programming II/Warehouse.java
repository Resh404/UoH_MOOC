public class Warehouse {
    protected double capacity;
    private final double capa;

    //Constructors
    public Warehouse(double capacity){
        this.capacity = capacity;
        this.capa = capacity;
    }

    //Methods
    public double getBalance(){
        return this.capacity;
    }

    public double getCapacity(){
        return this.capa;
    }

    public double howMuchSpaceLeft(){
        return (this.capa - this.capacity);
    }

    public void addToWarehouse(double amount){
        if (amount <= 0){
            return;
        } else if ((this.capacity + amount) >= this.capa) {
            this.capacity = this.capa;
        } else {
            this.capacity += amount;
        }
    }

    public double takeFromWarehouse(double amount){
        if (amount <= 0){
            return 0;
        } else if ((this.capacity - amount) <= 0) {
            this.capacity = 0;
            return this.capacity;
        } else {
            this.capacity -= amount;
            return this.capacity;
        }
    }

    @Override
    public String toString(){
        return ("Balance = " + this.getBalance() + " space left: " + this.howMuchSpaceLeft());
    }


}
