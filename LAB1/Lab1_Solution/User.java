import java.util.Random;

public class User {
    static int autoId = 0;    // Class variable for assigning ID
    private int userId;       // User Identification
    public static final int MAX_MESSAGE_LENGTH = 100;    // Maximum message length
    private ChatRoom assignedChatroom;    // ChatRoom object reference associated with the User object

    public User(ChatRoom cr) {
        autoId++;
        userId = autoId;
        assignedChatroom = cr;
    }

    // Broadcasts a random message to the ChatRoom
    public void writeMessage() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String message = "["+userId+"] ";
        Random messageRandomization = new Random();
        int messageLength = 1+messageRandomization.nextInt(MAX_MESSAGE_LENGTH);
        for (int i = 0; i < messageLength; i++) {
            message += alphabet.charAt(messageRandomization.nextInt(alphabet.length()));
        }
        assignedChatroom.receiveUserChat(message);
    }
}
