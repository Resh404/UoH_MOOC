public class ProductWarehouseWithHistory extends ProductWarehouse{
    private double initialBalance;
    private ChangeHistory histiory;

    //Constructors
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName,capacity);
        this.initialBalance = initialBalance;
        this.histiory = new ChangeHistory();
        this.histiory.add(this.initialBalance);
    }

    //Methods
    public String history(){
        return "" + this.histiory;
    }

    @Override
    public void addToWarehouse(double amount){
        if (amount <= 0){
            return;
        } else if ((this.capacity + amount) >= this.initialBalance) {
            this.capacity = this.initialBalance;
        } else {
            this.capacity += amount;
            this.histiory.add(this.capacity);
        }
    }

    @Override
    public double takeFromWarehouse(double amount){
        if (amount <= 0){
            return 0;
        } else if ((this.capacity - amount) <= 0) {
            this.capacity = 0;
            return this.capacity;
        } else {
            this.capacity -= amount;
            histiory.add(this.capacity);
            return this.capacity;
        }
    }

    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.histiory);
        System.out.println("Largest amount of product: " + histiory.maxValue());
        System.out.println("Smallest amount of product: " + histiory.minValue());
        System.out.println("Average: " + histiory.avgValue());
    }
}
