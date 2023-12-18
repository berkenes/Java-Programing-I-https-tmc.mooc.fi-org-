public class Container {
    private int amount;

    public Container() {
        this.amount = amount;
    }
    public int contains (){
        return amount;
    }
    public void add (int addAmount){
        if(addAmount<0){
            return;
        }
        else if(this.contains()+addAmount<=100){
            amount+=addAmount;
        }
        else {
            amount=100;
        }
    }
    public void remove(int Removeamount){
        if(Removeamount <=0){
         return;
        }
        else if (this.contains()-Removeamount <0){
            amount=0;
        }
        else {
            amount-=Removeamount;
        }
    }

    @Override
    public String toString() {
        return this.contains() + "/100";
    }
}
