//Neue Version
import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {
            int number = input.nextInt();
            if (number == -1) {
                break;
            }
            numbers.add(number);

        }
        int sum = sum(numbers);
        System.out.println(sum);


    }

    public static int sum(ArrayList<Integer> numbers) {
        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            result += numbers.get(i);
        }
        return result;
    }
    //jshlkqwjfhlqkwejfhlasflaksflasfaslf
}
