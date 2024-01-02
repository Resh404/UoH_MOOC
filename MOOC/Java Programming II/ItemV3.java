public class ItemV3 {
    private String name;
    private int weight;

    //Constructos
    public ItemV3(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public ItemV3(String name){
        this.name = name;
    }

    //Methods
    @Override
    public boolean equals(Object comparedObject) {
        // if the variables are located in the same place, they're the same
        if (this == comparedObject) {
            return true;
        }

        // if comparedObject is not of type Book, the objects aren't the same
        if (!(comparedObject instanceof ItemV3)) {
            return false;
        }

        // let's convert the object to a Book-object
        ItemV3 comparedItem = (ItemV3) comparedObject;

        // if the instance variables of the objects are the same, so are the objects
        if (this.name == comparedItem.name &&
                this.weight == comparedItem.weight) {
            return true;
        }

        // otherwise, the objects aren't the same
        return false;
    }

    @Override
    public int hashCode(){
        return this.weight;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getName(){
        return this.name;
    }
}
