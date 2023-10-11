
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String print = scanner.nextLine();
        if(print.equals("true")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
        }

    }

