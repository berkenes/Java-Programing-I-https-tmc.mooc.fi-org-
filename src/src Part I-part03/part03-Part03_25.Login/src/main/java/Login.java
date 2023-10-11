
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] benutzer = {"alex", "emma"};
        String[] kenntwort = {"sunshine", "haskell"};
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
int j = 0;
     //   boolean names = false;
        for ( int i = 0; i < kenntwort.length; i++) {
            if (benutzer[i].equals(username) && kenntwort[i].equals(password)) {
               // names = true;
                j++;
            }
        }
        if (j!=0) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
