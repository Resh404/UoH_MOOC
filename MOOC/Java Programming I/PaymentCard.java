public class PaymentCard {
    private double bala;

    public PaymentCard(double bala){
        this.bala = bala;
    }
    public void eatAffordably(){
        if (this.bala < 2.60){
            return;
        } else {
            this.bala = this.bala - 2.60;
        }
    }
    public void eatHeartily(){
        if (this.bala < 4.60){
            return;
        } else {
            this.bala = this.bala - 4.60;
        }
    }
    public void addMoney(double money){
        if (money > 150){
            this.bala = 150;
        } else if (money > 0){
            this.bala = this.bala + money;
        } else {
            return;
        }
    }
    @Override
    public String toString(){
        return ("The card has a balance of " + this.bala + " euros");
    }
}
