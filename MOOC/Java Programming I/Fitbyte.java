public class Fitbyte {
    private int age;
    private int restRate;
    public Fitbyte(int age, int restRate){
        this.age = age;
        this.restRate = restRate;
    }
    public double targetHeartRate(double percentageOfMaximum){
        double maxRate = 206.3 - (0.711 * age);

        return ((maxRate-this.restRate) * (percentageOfMaximum)   + 50);
    }
}
