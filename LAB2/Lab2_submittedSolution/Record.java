import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Record {
	public static void main(String[] args){
		Resident[] Person=new Resident[25];
		AuthResident[] AuthPerson=new AuthResident[25];
		int totalRes=0;
		int totalAuthRes=0;
		try {
			Scanner s=new Scanner(new File("/home/labex01/Desktop/input.dat"));
			while(s.hasNextLine()){
				Person[totalRes]=new Resident();
				Person[totalRes].setName(s.nextLine());
				boolean auth=false;
				if(s.nextLine().contains("yes")){
					auth=true;
				}
				Person[totalRes].setSex(s.nextLine());
				Person[totalRes].setAge(Integer.parseInt(s.nextLine()));
				Person[totalRes].setAddress(s.nextLine());
				if(auth){
					AuthPerson[totalAuthRes]=new AuthResident();
					AuthPerson[totalAuthRes].setName(Person[totalRes].getName());
					AuthPerson[totalAuthRes].setSex(Person[totalRes].getSex());
					AuthPerson[totalAuthRes].setAge(Person[totalRes].getAge());
					AuthPerson[totalAuthRes].setAddress(Person[totalRes].getAddress());
					totalAuthRes++;
				}
				totalRes++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("There are "+totalRes+" residents in the society.");
		System.out.println("Of these "+totalRes+", only "+totalAuthRes+" are authorized.");
		
		System.out.println("Query 1...");
		
		for(int i=0;i<totalAuthRes;i++){
			if(AuthPerson[i].getSex().charAt(0)=='f'){
				int elder=AuthPerson[i].elderThanMe(Person,totalRes);
				if (elder<2){
					System.out.println("The number of people elder than "+AuthPerson[i].getName()+" is "+elder+".");
				}
				else{
					System.out.println("The number of people elder than "+AuthPerson[i].getName()+" are "+elder+".");
				}
			}
		}
		
		System.out.println("Query 2...");
		
		for(int i=0;i<totalAuthRes;i++){
			if(AuthPerson[i].getSex().charAt(0)=='m'){
				int maxAge=AuthPerson[i].oldestManAge(Person,totalRes);
				System.out.println("The oldest man in the society is "+maxAge+"yrs old.");
				break;
			}
		}
		
		System.out.println("Query 3...");
		
		for(int i=0;i<totalAuthRes;i++){
			if(AuthPerson[i].getAge()>12 && AuthPerson[i].getAge()<20){
				String foundName=AuthPerson[i].findName(Person,totalRes,"C/34, Reed Street" );
				if(foundName==null){
					System.out.println("Sorry, none of the residents lives in the given address.");
				}
				else{
					System.out.println("The resident living in the given address is "+foundName+".");
				}
			}
		}	
	}
}
