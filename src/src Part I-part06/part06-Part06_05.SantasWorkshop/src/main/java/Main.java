
public class Main {

    public static void main(String[] args) {

        System.out.println("===========Part 1======================");
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift book2 = new Gift("abc", 4);
        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
        System.out.println("=======================Part2===================");

        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(book2);
        System.out.println(gifts.totalWeight());
    }

}

