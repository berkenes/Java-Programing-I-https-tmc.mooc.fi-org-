

public class FromOneToParameter {

    public static void main(String[] args) {

        printUntilNumber(2);
    }

    public static void printUntilNumber(int input) {
        int i = 1;
        while (i <= input) {

            System.out.println(i);
            i++;
        }

    }
}
