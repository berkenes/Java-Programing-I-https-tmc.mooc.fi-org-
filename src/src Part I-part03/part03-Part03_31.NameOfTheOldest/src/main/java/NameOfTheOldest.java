
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] inputs = input.split(",");
            name.add(inputs[0]);
            ages.add(Integer.parseInt(inputs[1]));

        }
        int oldest = ages.get(0);
        String nameOfTheOldest = name.get(0);

        for (int i = 1; i < ages.size(); i++) {
            int zahl = ages.get(i);
            if (oldest < zahl) {
                oldest = zahl;
                nameOfTheOldest = name.get(i);
            }
        }
        System.out.println("Name of the oldest: " + nameOfTheOldest);
    }
}
