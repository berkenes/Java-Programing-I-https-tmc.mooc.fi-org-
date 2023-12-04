import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    public void start(){
        boolean loop = true;

        while(loop){
            System.out.println("command: ");
            String command = scanner.nextLine();
           if(command.equals("stop")){
               loop = false;
               break;
           } else if (command.equals("add")) {
               System.out.println("To add: ");
               String add = scanner.nextLine();
               list.add(add);
           }
           else if(command.equals("list")){
               list.print();
           } else if (command.equals("remove")) {
               System.out.println("Which one is removed?");
               int removed = Integer.parseInt(scanner.nextLine());
               list.remove(removed);
           }

        }
    }
}
