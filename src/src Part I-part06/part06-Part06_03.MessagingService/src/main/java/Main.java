
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService service = new MessagingService();
        Message text = new Message("Enes", "wkwkwkwwwwwwwwwwwwww" +
                "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww" +
                "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww" +
                "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww" +
                "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwEven though " +
                "there is no one on the ride, the string is on the print output." +
                " Let's modify the method so that if there is no one on the ride," +
                " the string returned by the method informs of it.riding:toString");
        Message text2 = new Message("Samil", "Warum hast du sehr lange Text geschrieben?!!!");
service.add(text);
service.add(text2);

    }
}
