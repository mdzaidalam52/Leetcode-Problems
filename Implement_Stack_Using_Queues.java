class MyStack {
    
    Deque<Integer> q;

    /** Initialize your data structure here. */
    public MyStack() {
        q = new ArrayDeque<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.addFirst(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.removeFirst();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
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

 // Code by Md Zaid Alam