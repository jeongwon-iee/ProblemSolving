class MyStack {
    
    Queue<Integer> queue;
    Queue<Integer> stack;
    int stackTop;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        stack = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        stackTop=x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int topElement=queue.peek();
        while(topElement != stackTop) {
            int data = queue.poll();
            stack.offer(data);
            topElement=queue.peek();
        }
        queue.poll();
        
        while(!stack.isEmpty()) {
            stackTop = stack.poll();
            queue.offer(stackTop);
        }
        return topElement;
    }
    
    /** Get the top element. */
    public int top() {
        return stackTop;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
