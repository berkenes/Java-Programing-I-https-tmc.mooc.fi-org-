

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int input) {

        while (input > 0) {
            System.out.println(input);
            input--;
        }
    }

}
