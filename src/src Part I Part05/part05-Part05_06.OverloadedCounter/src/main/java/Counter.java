public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value=0;
    }
    public int value (){
        return value;
    }
    public void increase (){
        value++;
    }
    public void decrease(){
        value--;
    }
    public void increase (int increaseBy){
        if(increaseBy>0){
            value=increaseBy+value;
        }

    }
    public void decrease (int decreaseBy){
        if(decreaseBy>0){
            value=value-decreaseBy;
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }
}
