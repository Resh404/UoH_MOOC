public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct(){
        System.out.print(this.name);
        System.out.print(", price " + this.price);
        System.out.println("," + this.quantity + " pcs");
    }
}
