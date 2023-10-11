
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3,9);

    }
    public static void divisibleByThreeInRange(int first, int second){
        for(int i = first; i<= second; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }

}
