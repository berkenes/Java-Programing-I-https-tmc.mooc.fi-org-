
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> jahren = new ArrayList<>();
int years = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.length() > 0) {
                String[] inputs = input.split(",");
                names.add(inputs[0]);
                jahren.add(Integer.valueOf(inputs[1]));
                years+=Integer.valueOf(inputs[1]);
            }
            if (input.equals("")) {
                break;
            }
        }
        String longest = names.get(0);
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > longest.length()) {
                longest = names.get(i);
            }
        }

        int sum = 0;
        for (int i = 0; i < jahren.size(); i++) {
            sum = sum + jahren.get(i);
        }
        System.out.println("Longest names: " + longest);
        System.out.println("Average of the birth years: " + (double) sum / jahren.size());
        System.out.println("Average of the birth years: " + (double) years / names.size());
    }
}
