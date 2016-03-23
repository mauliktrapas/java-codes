/**
 * The place where we create ChatRoom and User and get the users to broadcast messages
 */
class ChatApplication {
    public static void main(String[] args) {
        ChatRoom cr = new ChatRoom(); // an object of type Chatroom called "cr" is created. How? (inside ChatRoom.java)
        User u1 = new User(cr); // an object of type User called "u1" created. How? (inside User.java)
        User u2 = new User(cr); // another object of type User called "u2" is created.
        int converationLength = 10; // What happens next?
        for (int i = 0; i < 10; i++) {
            u1.writeMessage(); // ?
            u2.writeMessage(); // ?
        }
        cr.printLog(); // chat room starts the log printing behavior
    }
}
