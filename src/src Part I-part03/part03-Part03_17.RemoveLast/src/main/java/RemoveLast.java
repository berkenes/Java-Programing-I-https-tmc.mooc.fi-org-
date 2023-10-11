
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

            strings.add("first");
        strings.add("second");
        strings.add("third");
            removeLast(strings);
            removeLast(strings);
        System.out.println(strings);
        }

    public static void removeLast(ArrayList<String> abc) {
        if (abc.size() !=0) {
            abc.remove(abc.size() - 1);

        }

    }

}
