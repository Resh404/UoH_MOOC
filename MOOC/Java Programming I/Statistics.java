public class Statistics {
    private int sum;
    private int count;
    public Statistics(){
        this.sum = 0;
    }
    public void addNum(int num){
        this.sum = this.sum + num;
        this.count = this.count + 1;
    }
    public int getCount(){
        return this.count;
    }
    public int getSum(){
        return this.sum;
    }
    public double getAvg(){
        return ((double) this.sum /this.count);
    }
}
