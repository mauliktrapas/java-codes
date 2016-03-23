import java.util.Scanner;

public class Main_Queue {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		// Queue using a Stack - Execution
		
		Queue_Stack<Integer> qs=new Queue_Stack<Integer>();
		for(int i=0;i<5;i++){
			qs.enqueue(s.nextInt());
		}
		for(int i=0;i<6;i++){
			System.out.println(qs.dequeue());
		}
		
		// Queue using a Linked List - Execution
		
		Queue_LinkedList<Integer> ql=new Queue_LinkedList<Integer>();
		for(int i=0;i<5;i++){
			ql.enqueue(s.nextInt());
		}
		for(int i=0;i<6;i++){
			System.out.println(ql.dequeue());
		}
	}
}