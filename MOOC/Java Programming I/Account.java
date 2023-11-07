//Exercises from Java Programming I part 4 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class Account {
    private String acc;
    private double bala;

    public Account(String acc, double bala){
        this.acc = acc;
        this.bala = bala;
    }

    @Override
    public String toString() {
        return acc + " balance: " + bala;
    }
    public double balance(){
        return this.bala;
    }
    public void withdraw(double amount){
        this.bala = this.bala-amount;
    }

    public void deposit(double amount){
        this.bala = this.bala+amount;
    }
}
