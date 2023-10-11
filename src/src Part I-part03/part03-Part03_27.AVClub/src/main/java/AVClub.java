
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {


            String input = scanner.nextLine();

            String[] word = input.split(" ");
            for (String inputs : word) {
                if (inputs.contains("av")) {
                    System.out.println(inputs);

                }
            }
            if (input.equals("")) {
                break;
            }
        }
    }
}