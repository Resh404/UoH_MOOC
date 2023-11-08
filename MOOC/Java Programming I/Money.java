public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    public Money plus(Money addition){
        Money newMoney = new Money(this.euros, this.cents);
        newMoney = new Money((addition.euros+this.euros), (addition.cents+this.cents));

        return newMoney;
    }
    public boolean lessThan(Money compared){
        if (this.euros < compared.euros){
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        return false;
    }
    public Money minus(Money decreaser){
        int euro = this.euros - decreaser.euros;
        int cent = this.cents - decreaser.cents;

        if (euro < -1){
            euro = 0;
            cent = 0;
            return new Money(euro,cent);
        }

        if (euro == 0 && cent >= 0){
            return new Money(euro, cent);
        }

        if (euro == 0 && cent < 0){
            cent = 0;
            return new Money(euro,cent);
        }

        if (euro > 0 && cent < 0){
            cent = 100 + cent;
            euro = euro - 1;
        }

        return new Money(euro, cent);
    }
    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}