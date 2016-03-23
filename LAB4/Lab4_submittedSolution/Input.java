import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Input {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s=new Scanner(new File("input.dat"));
		int m,n;
		m=s.nextInt();
		n=s.nextInt();
		Cells.setRows(m);
		Cells.setColumns(n);
		s.nextLine();
		String[] inputState=new String[m];
		
		for(int i=0;i<m;i++){
			inputState[i]=s.nextLine();
		}
		
		Cells.setState(inputState);
		
		for(int i=0;i<100;i++){
			Cells.nextState();
			System.out.println("At Step="+(i+1)+":");
			Cells.printState();
		}
	}
}
