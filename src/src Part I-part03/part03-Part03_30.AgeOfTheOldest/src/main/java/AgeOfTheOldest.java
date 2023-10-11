
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        while (true){
           String input = scanner.nextLine();
           if(input.equals("")){
                break;
            }
               String[] inputsplit = input.split(",");
               name.add(inputsplit[0]);
               age.add(Integer.parseInt(inputsplit[1]));
        }
        int oldest = age.get(0);
        for(int i = 1; i< age.size(); i++){
            if(oldest< age.get(i)){
                oldest= age.get(i);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
