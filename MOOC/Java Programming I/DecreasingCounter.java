public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter
    public DecreasingCounter(int value) {
        this.value = value;
    }
    public void printValue() {
        System.out.println("value: " + this.value);
    }
    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (this.value > 0){ //Exercise 7
            this.value = this.value - 1; //Exercise 6
        } else {
            return;
        }
    }
    // and the other methods go here
    public void reset(){ //Exercise 8
        this.value = 0;
    }
}
