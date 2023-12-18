
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
       boolean loop = true;
        while (loop) {
            System.out.print("First: " + first + "/100\n" +
                    "second: " + second + "/100\n");


            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] userInput = input.split(" ");
            String command = userInput[0];
            int amount = Integer.valueOf(userInput[1]);
            if(amount <=0){
               continue;
            }
            switch (command){
                case "add":
                   /* if(amount <=0){
                        return;
                    }*/
                    if(first + amount <=100){
                        first+=amount;
                    }
                  else {
                        first=100;
                    }
                    break;
                case "move":
                    if(first == 0){
                        return;
                    }
                    if (first - amount <0){
                        amount = first;
                    }
                    if(amount >= 100){
                        first = 0;
                        amount = 100;
                    } else if (second+amount <=100) {
                        second+=amount;
                        first-=amount;

                    } else if (second+amount>100) {
                        second=100;
                        first=0;
                    }
                    break;
                case "remove":
                  /*  if(amount<=0){
                        return;
                    }*/
                    if(amount>second){
                        amount=0;
                    }
                    else {
                        second-=amount;
                    }
                    break;
                default:
                    System.out.println("Unknown command");

            }

        }
    }

}
