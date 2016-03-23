import java.util.Stack;

public class Queue_Stack<Type> {
	
	private Stack<Type> s1=new Stack<Type>();
	private Stack<Type> s2=new Stack<Type>();
	
	public void enqueue(Type d){
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		s1.push(d);
	}
	
	public Type dequeue(){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		if(!s2.isEmpty()){
			return s2.pop();
		}
		else{
			return null;
		}
	}
}