class Stack {
    private Object[] _stack = new Object[1000];
    private int head = -1;

    public boolean empty() {
        if (head == -1) return true;
        return false;
    }

    public Object peek() {
        if (!this.empty()) return _stack[head];
        return null;
    }

    public Object push(Object obj) {
        head++;
        if (head == _stack.length) reassign(); 
        _stack[head] = obj;
        return peek();
    }

    public Object pop() {
        if (this.empty()) return null;
        return _stack[head--];
    }

    public int search(Object obj) {
        if (this.empty()) return -1;
        for (int i = 0; i < head; i++)
            if (_stack[i] == obj) return i+1;
        return -1;
    }

    private void reassign() {
        Object[] newstack = new Object[_stack.length];
        for (int i = 0; i < _stack.length; i++) newstack[i] = _stack[i];
        _stack = new Object[_stack.length*2];
        for (int i = 0; i < newstack.length; i++) _stack[i] = newstack[i];
    }
}
