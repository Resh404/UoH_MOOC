public class ProductV2 {
    private String name;
    private String loco;
    private int weight;
    public ProductV2(String name, String loco, int weight){
        this.name = name;
        this.loco = loco;
        this.weight = weight;
    }
    public ProductV2(String name){
        this(name,"shelf",1);
    }
    public ProductV2(String name, String location){
        this(name,location,1);
    }
    public ProductV2(String name, int weight){
        this(name,"shelf", weight);
    }
    public void incWeight(){
        this.weight = this.weight +1;
    }
    @Override
    public String toString(){
        return (this.name + " (" + this.weight + " kg)" + " can be found from the " + this.loco);
    }
}
