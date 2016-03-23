class QueueLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
	
    public QueueLinkedList() {
        head = null;
        tail = null;
    }
	
    public void Enqueue(T d) {
        Node<T> newNodeToAdd = new Node(d);
	if (isEmpty())
            head = newNodeToAdd;
        else
            tail.setNext(newNodeToAdd);
        tail = newNodeToAdd;
    }

    public T dequeue() {
        if(isEmpty())
            return null;
        T headData = head.getData();
        head = head.getNext();
        if (head==null)
            tail=null;
        return headData;
    }

    public boolean isEmpty() {
        return head==null;
    }
}
