public class Queue_LinkedList<Type> {
	
	private Node<Type> head;
	private Node<Type> tail;
	
	public Queue_LinkedList(){
		head=null;
		tail=null;
	}
	
	public boolean isEmpty(){
		return (head==null);
	}
	
	public void enqueue(Type d){
		Node<Type> nodeToAdd=new Node<Type>(d);
		if(this.isEmpty()){
			head=nodeToAdd;
		}
		else{
			tail.next=nodeToAdd;
		}
		tail=nodeToAdd;
	}
	
	public Type dequeue(){
		if(this.isEmpty()){
			return null;
		}
		Type headData=head.data;
		head=head.next;
		if(head==null){
			tail=null;
		}
		return headData;
	}
}