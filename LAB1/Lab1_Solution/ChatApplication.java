/**
 * The place where we create ChatRoom and User and get the users to broadcast messages
 */
public class ChatApplication {
    public static void main(String[] args) {
        ChatRoom cr = new ChatRoom();
        User u1 = new User(cr);
        User u2 = new User(cr);
        int converationLength = 10;
        for (int i = 0; i < 10; i++) {
            u1.writeMessage();
            u2.writeMessage();
        }
        cr.printLog();
    }
}
