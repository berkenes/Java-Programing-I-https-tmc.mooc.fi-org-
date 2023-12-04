
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;

    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    public Money plus (Money addition){
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        if (cents > 99){
           newEuros++;
           newCents =0;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;

    }
    public boolean lessThan (Money compared){
        if(100*this.euros + this.cents < 100*compared.euros + compared.cents){
            return true;
        }
        return false;
    }
    public Money minus (Money decreaser){
        int decEuros = this.euros - decreaser.euros;
        int decCent = this.cents - decreaser.cents;
        if (this.euros> decreaser.euros){
            if(this.cents < decreaser.cents){
            decCent = this.cents +100 - decreaser.cents;
            decEuros --;
            }
            else {
                decCent = this.cents - decreaser.cents;
            }
        }
        if (this.euros <decreaser.euros) {
            decEuros = 0;
            decCent=0;
        }
        return new Money(decEuros, decCent);

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
