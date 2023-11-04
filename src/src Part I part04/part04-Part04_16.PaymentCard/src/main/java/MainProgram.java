import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard card = new PaymentCard(10);
        PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);
        paul.eatHeartily();
        matt.eatAffordably();
        System.out.println("Paul's Card: " + paul);
        System.out.println("Matt's Card: " + matt);
        paul.addMoney(20);
        matt.eatHeartily();
        System.out.println("Paul's Card: " + paul);
        System.out.println("Matt's Card: " + matt);
        paul.eatAffordably();
        paul.eatAffordably();
        matt.addMoney(50);
        System.out.println("Paul's Card: " + paul);
        System.out.println("Matt's Card: " + matt);
        //System.out.println(card);

        //card.eatAffordably();
        //System.out.println(card);

        //card.eatHeartily();
        //card.eatAffordably();
        //System.out.println(card);
        //card.addMoney(15);
        //System.out.println(card);
        //card.addMoney(200);
        //System.out.println(card);
    }
}
