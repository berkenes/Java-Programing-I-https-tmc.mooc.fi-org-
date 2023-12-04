import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary SimpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        SimpleDictionary = simpleDictionary;
    }

    public void start() {
        boolean loop = true;
        while (loop) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            switch (input) {
                case "end":
                    System.out.println("Bye bye!");
                    loop = false;
                    break;
                case "add":
                    System.out.println("Word: ");
                    String wordInput = scanner.nextLine();
                    System.out.println("Translation: ");
                    String translationInput = scanner.nextLine();
                    SimpleDictionary.add(wordInput, translationInput);
                    break;
                case "search":
                    System.out.println("To be translated: ");
                    String translateInput = scanner.nextLine();
                    if (SimpleDictionary.translate(translateInput) == null) {
                        System.out.println("Word " + translateInput + " was not found");
                    } else {
                        System.out.println(" Translation: " + SimpleDictionary.translate(translateInput));
                    }
                    break;
                default:
                    System.out.println("Unknown command");
            }


        }
    }
}
