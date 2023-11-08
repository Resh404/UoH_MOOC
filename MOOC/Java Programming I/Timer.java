public class Timer {
    private ClockHand centiSec;
    private ClockHand sec;
    public Timer(){
        this.sec = new ClockHand(60);
        this.centiSec = new ClockHand(100);
    }
    public void advance(){
        this.centiSec.advance();

        if (this.centiSec.value() == 0){
            this.sec.advance();
        }
    }
    @Override
    public String toString(){
        return this.centiSec + ":" + this.sec;
    }
}
