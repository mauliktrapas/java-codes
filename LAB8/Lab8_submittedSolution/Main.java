import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner s=new Scanner(new File("input.dat"));
		BinarySearchTree tree=new BinarySearchTree();
		int n=Integer.parseInt(s.nextLine());
		
		for(int i=0;i<n;i++){
			String[] input=s.nextLine().split(" ");
			String name=input[0];
			int tenure=Integer.parseInt(input[1]);
			int salary=Integer.parseInt(input[2]);
			int id=Integer.parseInt(input[3]);
			tree.addEmployee(name,tenure,salary,id);
		}
		
		int m=Integer.parseInt(s.nextLine());
		
		for(int i=0;i<m;i++){
			String[] input=s.nextLine().split(" ");
			int tenure=Integer.parseInt(input[0]);
			int salary=Integer.parseInt(input[1]);
			tree.searchEmployee(tenure,salary);
		}
	}
}
