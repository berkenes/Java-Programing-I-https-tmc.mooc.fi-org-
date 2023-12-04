
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        System.out.println("***********Part 1**********************");
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());

        System.out.println("******************Part 2************************");
        Stack st = new Stack();
        st.add("1");
        st.add("2");
        st.add("3");
        st.add("4");
        st.add("5");

        while (!st.isEmpty()) {
            System.out.println(st.take());
        }

    }
}
