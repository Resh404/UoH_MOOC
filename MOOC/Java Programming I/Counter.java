public class Counter {
    private int stVal;
    public Counter(){
        this.stVal = 0;
    }
    public int value(){
        return this.stVal;
    }
    public void increase(){
        this.stVal = this.stVal + 1;
    }
    public void decrease(){
        this.stVal = this.stVal -1;
    }
    public void increase(int increaseBy){
        this.stVal = this.stVal + increaseBy;
    }
    public void decrease(int decreaseBy){
        this.stVal = this.stVal -decreaseBy;
    }
}
