import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title: ");
            String inputTitle = scanner.nextLine();
            if (inputTitle.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int inputPages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int inputYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(inputTitle, inputPages, inputYear));
        }
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        if(input.equals("everything")) {
            for (Book printBook : books) {
                System.out.println(printBook);
            }
        }
            if (input.equals("name")){
                for (Book printBook: books) {
                    System.out.println(printBook.getTitle());
                }
            }
            else {
                return;
            }
        }
    }

