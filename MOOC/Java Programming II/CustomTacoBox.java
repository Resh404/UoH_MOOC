public class CustomTacoBox implements TacoBox{
    private int tacos;

    //Constructors
    public CustomTacoBox(){
        this.tacos = 3;
    }

    //Methods
    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
    this.tacos -= 1;
    }
}
