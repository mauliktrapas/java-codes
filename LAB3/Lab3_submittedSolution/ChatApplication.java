import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ChatApplication{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(new File("input.dat"));
		String[] userNames=s.nextLine().split(" ");
		ChatRoom cr=new ChatRoom(userNames);
		while(s.hasNext()){
			String what=s.next();
			if(what.equals("C")){
				String from=s.next();
				String to=s.next().split(":")[0];
				String message=s.nextLine();
				User fromUser=cr.getUserDetails(from);
				User toUser=cr.getUserDetails(to);
				fromUser.composeMessage(message,fromUser,toUser);
			}
			else if(what.equals("Q")){
				String user=s.next();
				User queryUser=cr.getUserDetails(user);
				System.out.println(user+"'s sent messages");
				queryUser.printSentMessages();
				System.out.println(user+"'s received messages");
				queryUser.printReceivedMessages();
			}
		}
	}

}
