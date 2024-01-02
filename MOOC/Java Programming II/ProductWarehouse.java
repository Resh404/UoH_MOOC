public class ProductWarehouse extends Warehouse{
    private String name;

    //Constructos
    public ProductWarehouse(String name,double capacity){
        super(capacity);
        this.name = name;

    }

    //Methods
    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    @Override
    public String toString(){
        return (this.name + ": " + super.toString());
    }
}
