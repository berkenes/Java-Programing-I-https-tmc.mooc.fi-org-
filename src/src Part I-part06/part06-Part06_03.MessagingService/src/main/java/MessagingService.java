import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }
 public void add (Message message){
        if(message.getContent().length()<=280){
            messages.add(message);
            System.out.println("Message added: " + message);
        }
        else{
            System.out.println("To long for this!!Please try again");
        }
 }
 public ArrayList<Message> getMessages(){
        return messages;
 }
}