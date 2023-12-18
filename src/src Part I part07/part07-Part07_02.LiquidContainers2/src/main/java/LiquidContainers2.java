
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.print("First: " + first + "\n" +
                    "second: " + second + "\n");


            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            }
            String[] userInput = input.split(" ");
            String command = userInput[0];
            int amount = Integer.valueOf(userInput[1]);
            switch (command) {
                case "add":
                    first.add(amount);
                    break;
                case "move":
                    if (amount <= 0 || first.contains() == 0) {
                        return;
                    }
                    if (first.contains() - amount < 0) {
                        amount = first.contains();
                    }
                    first.remove(amount);
                    second.add(amount);
                    break;
                case "remove":
                    second.remove(amount);
                    break;
                default:
                    System.out.println("Unknown command");
            }

        }
    }

}
