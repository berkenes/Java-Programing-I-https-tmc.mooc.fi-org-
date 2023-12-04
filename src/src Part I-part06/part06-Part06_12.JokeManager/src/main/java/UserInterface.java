import java.util.Scanner;

public class UserInterface {
    private JokeManager joke;
    private Scanner scanner;

    public UserInterface(JokeManager joke, Scanner scanner) {
        this.joke = joke;
        this.scanner = scanner;
    }
    public void start(){

        boolean loop = true;
        while (loop){
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String input = scanner.nextLine();
            switch (input){
                case "X":
                    loop=false;
                    break;
                case "1":
                    System.out.println("Write the joke to be added");
                    String addJoke = scanner.nextLine();
                    joke.addJoke(addJoke);
                  break;
                case "2":
                    System.out.println(joke.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    joke.printJokes();
                    break;
                default:
                    System.out.println("unknown command, please try again");
            }
        }
    }
}
