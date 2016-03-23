/**
 * The user has an attribute for alias, and keeps track of her sent/received messages.
 */
class User {
    public static final int MAX_CHAT = 10;
    private String sentMessages[] = new String[MAX_CHAT];
    private String receivedMessages[] = new String[MAX_CHAT];
    private String alias;
    private int totalSent = 0;
    private int totalReceived = 0;
    private ChatRoom assignedChatroom;

    public User(String alias, ChatRoom cr) {
        this.alias = alias;
        this.assignedChatroom = cr;
    }

    public void writeMessage(String message, User u2) {
        sentMessages[totalSent++] = message;
        assignedChatroom.transferMessage(message, u2);
    }
    
    public void receiveMessage(String message) {
        receivedMessages[totalReceived++] = message;
    }
   
    public void printSentMessages() {
        for (int i = 0; i < totalSent; i++)
            System.out.println(sentMessages[i]); 
    }
 
    public void printReceivedMessages() {
        for (int i = 0; i < totalReceived; i++)
            System.out.println(receivedMessages[i]); 
    }

    public String getAlias() {
        return alias;
    }
}
