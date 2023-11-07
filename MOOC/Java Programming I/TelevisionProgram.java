public class TelevisionProgram {
    private String name;
    private int dura;
    public TelevisionProgram(String name, int dura){
        this.name = name;
        this.dura = dura;
    }
    public int getDura(){
        return this.dura;
    }
    @Override
    public String toString(){
        return (this.name + ", " + this.dura);
    }
}
