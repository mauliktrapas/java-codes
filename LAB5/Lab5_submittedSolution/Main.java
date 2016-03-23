import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Employee[] list=new Employee[20];
		Employee[] transferList=new Employee[20];
		int n=0,ntrans=0,MAX_LIMIT=0;
		
		try {
			Scanner s=new Scanner(new File("input.dat"));
			n=Integer.parseInt(s.nextLine());
			for(int i=0;i<n;i++){
				list[i]=new Employee();
				String[] input=s.nextLine().split(", ");
				list[i].setId(Integer.parseInt(input[0]));
				list[i].setName(input[1]);
				list[i].setTenure(Integer.parseInt(input[2]));
				list[i].setSalary(Integer.parseInt(input[3]));
			}
			ntrans=s.nextInt();
			MAX_LIMIT=s.nextInt();
			
			for(int j=0;j<ntrans;j++){
				transferList[j]=new Employee();
				transferList[j].setId(s.nextInt());
				for(int i=0;i<n;i++){
					if(transferList[j].getId()==list[i].getId()){
						transferList[j].setName(list[i].getName());
						transferList[j].setTenure(list[i].getTenure());
						transferList[j].setSalary(list[i].getSalary());
						break;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("The total number of employees currently working in the Head Quarters - "+n);
		System.out.println("The number of employees who have opted for a transfer to the new branch - "+ntrans);
		System.out.println("And, at most only "+MAX_LIMIT+" can be transferred.");
		
		int moreTenure=transferList[0].getTenure();
		int moreSalary=transferList[0].getSalary();
		int[] newId=new int[MAX_LIMIT];
		
		for(int i=0;i<MAX_LIMIT;i++){
			newId[i]=transferList[0].getId();
			for(int j=0;j<ntrans;j++){
				if(transferList[j].getTenure()>moreTenure){
					moreTenure=transferList[j].getTenure();
					newId[i]=transferList[j].getId();
				}
				else if(transferList[j].getTenure()==moreTenure){
					if(transferList[j].getSalary()>moreSalary){
						moreSalary=transferList[j].getSalary();
						newId[i]=transferList[j].getId();
					}
				}
			}
		}
		
		// ID's of the employees in the Head Quarters
		
		System.out.println("HQ");
		
		if(n==ntrans && ntrans<=MAX_LIMIT){
			System.out.println("No one is currently working in the head quarters.");
		}
		else{
			for(int i=0;i<n;i++){
				for(int j=0;j<MAX_LIMIT;j++){
					if(list[i].getId()==newId[j]){
						
					}
					else{
						System.out.println(list[i].getId());
						break;
					}
				}
			}
		}
		
		// ID's of the employees shifted to the new branch
		
		System.out.println("NEW");
		
		if(ntrans<=MAX_LIMIT){
			for(int i=0;i<ntrans;i++){
				System.out.println(transferList[i].getId());
			}
		}
		else{
			for(int i=0;i<MAX_LIMIT;i++){
				System.out.println(newId[i]);
			}
		}
	}
}
