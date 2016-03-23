
public class ChatRoom {
	User[] users=new User[20];
	
	public ChatRoom(String[] userNames){
		for(int i=0;i<userNames.length;i++){
			users[i]=new User(userNames[i],this);
		}
	}
	
	public void transferMessage(String message,User from,User to){
		to.receiveMessage(message,from);
	}
	
	public User getUserDetails(String name){
		for(int i=0;i<users.length;i++){
			if(users[i].getName().equals(name)){
				return users[i];
			}
		}
		return null;
	}
	
}
