
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String name = scanner.nextLine();
            System.out.println("Name: " + name);
            if(name.isEmpty()){
                break;
            }
            items.add(new Item(name));
        }
        for (Item names: items){
            System.out.println(names);
        }
    }

}
