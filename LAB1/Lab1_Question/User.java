import java.util.Random;

class User {
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
        String alphabet = "abcdefghijklmnopqrstuvwxyz";// a String object "abcdefghijklmnopqrstuvwxyz" is created.
        String message = "["+userId+"] ";    // What happens here?
        Random messageRandomization = new Random();    // What happens here?
        int messageLength = 1+messageRandomization.nextInt(MAX_MESSAGE_LENGTH); // the Random object "messageRandomization" finds the next integer in the range [0, 100).
        for (int i = 0; i < messageLength; i++) { // What is the range of values possible to be assigned for messageLength?
            message += alphabet.charAt(messageRandomization.nextInt(alphabet.length())); // What happens here?
        }
        // Fill out - you need to send the message to the ChatRoom object
    }
}
