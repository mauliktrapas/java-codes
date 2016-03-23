
public class ChatRoom {
	public static final int MAX_CHAT_LOGS=1000;
	private String chatLogs[]=new String[MAX_CHAT_LOGS];
	private int totalChats;
	
	public ChatRoom(){
		
	}
	
	public void receiveUserChat(String message){
		chatLogs[totalChats]=message;
		totalChats++;
	}
	
	public void printLog(){
		for(int i=0;i<totalChats;i++){
			System.out.println(chatLogs[i]);
		}
	}
}
