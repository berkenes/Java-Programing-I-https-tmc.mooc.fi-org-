
import java.util.Arrays;
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String[] erst = first.split(" ");
        for (int i = 0; i < erst.length; i++) {
            System.out.println(erst[i]);
        }
        String second = scanner.nextLine();
        String[] zwei = second.split(" ");
        for (int i = 0; i < zwei.length; i++) {
            System.out.println(zwei[i]);
        }
        String dritte = scanner.nextLine();
        System.out.println(dritte);

    }
}
