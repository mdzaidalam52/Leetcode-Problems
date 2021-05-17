class MinStack {

    Stack<Integer> st;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty() || st.peek() <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        int a = st.pop();
        if(a == min.peek())
            min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 // Code by Md Zaid Alam