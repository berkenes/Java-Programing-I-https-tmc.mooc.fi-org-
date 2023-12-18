import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        String [] arrayString ={"Enes","Berk","Samil","Vurdem","Kenan","Goztas"};
        sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
       ArrayList<String> listString = new ArrayList<>();
       listString.add("Enes");
        listString.add("Berk");
        listString.add("Samil");
        listString.add("Vurdem");
        listString.add("Kenan");
        listString.add("Goztas");
        System.out.println(listString);
       sortStrings(listString);
        System.out.println(listString);

       /* System.out.println(Arrays.toString(arrayString));
        sort(arrayString);
        System.out.println(Arrays.toString(arrayString));*/
    }
    public static void sort (int [] array){
        Arrays.sort(array);
    }
    public static void sort (String [] array){
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

}
