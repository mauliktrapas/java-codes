class Node<T> {
    private T data;
    private Node<T> nextNode;
	
    public Node(T d) {
        data = d;
        nextNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T d) {
        data = d;
    }

    public Node<T> getNext() {
        return nextNode;
    }

    public void setNext(Node<T> node) {
        nextNode = node;
    }
}
