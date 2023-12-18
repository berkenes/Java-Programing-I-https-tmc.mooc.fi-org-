
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Grade neu = new Grade();
        UserInterface UI = new UserInterface(neu, scanner);
        UI.start();
    }
}
