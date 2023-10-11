
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            int value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {

                break;
            }
            if (value > 0) {
                count++;
                sum = sum + value;

            }

        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
