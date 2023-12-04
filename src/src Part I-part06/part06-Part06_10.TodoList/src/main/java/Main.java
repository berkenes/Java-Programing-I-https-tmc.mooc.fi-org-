
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        executivepart1a();
      executivepart1b();

        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);



    }

    private static void executivepart1b() {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }

    private static void executivepart1a() {
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();

    }
}
