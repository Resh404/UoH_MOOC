public class Debt {
    private double bala;
    private double intRate;

    public Debt(double bala, double intRate){
        this.bala = bala;
        this.intRate = intRate;
    }

    public void printBalance(){
        System.out.println(this.bala);
    }

    public void waitOneYear(){
        this.bala = (this.bala * this.intRate);
    }
}
