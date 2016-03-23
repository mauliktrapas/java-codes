import java.util.Random;

public class User {
	static int autoId=0;
	private int userId;
	public static final int MAX_MESSAGE_LENGTH=100;
	private ChatRoom assignedChatRoom;
	
	public User(ChatRoom cr){
		autoId++;
		userId=autoId;
		assignedChatRoom=cr;
	}
	
	public void writemessage(){
		String alphabet="qwertyuiopasdfghjklzxcvbnm";
		String message="["+userId+"]--> ";
		Random msgRandomization=new Random();
		int msgLength=1+msgRandomization.nextInt(MAX_MESSAGE_LENGTH);
		for(int i=0;i<msgLength;i++){
			message+=alphabet.charAt(msgRandomization.nextInt(alphabet.length()));
		}
		assignedChatRoom.receiveUserChat(message);
	}
}
