public class TripleTacoBox implements TacoBox{
    private int tacos;

    //Constructors
    public TripleTacoBox(){
        this.tacos = 3;
    }

    //Methods
    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
    this.tacos = this.tacos - 1;
    }
}
