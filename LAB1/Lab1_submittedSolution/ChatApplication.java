
public class ChatApplication {
	public static void main(String[] args){
		ChatRoom cr=new ChatRoom();
		User u1=new User(cr);
		User u2=new User(cr);
		int conversationLength=10;
		for(int i=0;i<conversationLength;i++){
			u1.writemessage();
			u2.writemessage();
		}
		cr.printLog();
	}
}
