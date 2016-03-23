public class ChatRoom {
    public static final int MAX_CHAT_LOGS = 1000;
    private String []chatLogs = new String[MAX_CHAT_LOGS];
    private int totalChats;

    // Our ChatRoom has no defining properties for now
    public void ChatRoom() {
    }

    // Store the user chat
    public void receiveUserChat(String message) {
        chatLogs[totalChats] = message;
        totalChats++;
    }

    // Retreive the chat logs
    public void printLog() {
        for (int j = 0; j < totalChats; j++) {
            System.out.println(chatLogs[j]);
        }
    }
}
