
public class User {
	public static final int MAX_CHAT=20;
	private String[] sentMessages=new String[MAX_CHAT];
	private String[] receivedMessages=new String[MAX_CHAT];
	private String name;
	private ChatRoom assignedChatRoom;
	private int totalSent=0;
	private int totalReceived=0;
	
	public User(String name,ChatRoom cr){
		this.name=name;
		this.assignedChatRoom=cr;
	}
	
	public String getName(){
		return name;
	}
	
	public void composeMessage(String message,User from,User to){
		sentMessages[totalSent]=(totalSent+1)+") To "+to.getName()+" :"+message;
		totalSent++;
		assignedChatRoom.transferMessage(message,from,to);
	}
	
	public void receiveMessage(String message,User from){
		receivedMessages[totalReceived]=(totalReceived+1)+") From "+from.getName()+" :"+message;
		totalReceived++;
	}
	
	public void printSentMessages(){
		for(int i=0;i<totalSent;i++){
			System.out.println(sentMessages[i]);
		}
	}
	
	public void printReceivedMessages(){
		for(int i=0;i<totalReceived;i++){
			System.out.println(receivedMessages[i]);
		}
	}
}
