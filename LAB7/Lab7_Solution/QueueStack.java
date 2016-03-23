import java.util.Stack;

class QueueStack<T> {
    private Stack<T> stack1 = new Stack();
    private Stack<T> stack2 = new Stack();
	
    public void enqueue(T d) {
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());
        stack1.push(d);
    }

    public T dequeue() {
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        if(!stack2.isEmpty())
            return stack2.pop();
        else
            return null;
    }
}
