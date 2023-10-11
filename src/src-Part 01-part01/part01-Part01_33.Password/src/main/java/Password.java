
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Password?");
        String message = scan.nextLine();
        if (message.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }
}
