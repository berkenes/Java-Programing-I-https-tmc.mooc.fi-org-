
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        sum += number;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {

        return this.sum;
    }

    public double average() {
        double result = 0;

        if (this.sum != 0 && this.count != 0) {
            result = (double) this.sum / this.count;
        }
        return result;
    }
}
