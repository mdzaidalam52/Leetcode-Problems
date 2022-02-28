class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Long> st = new Stack<>();
        for (String str : tokens) {
            switch (str) {
                case "+":
                    add(st);
                    break;
                case "-":
                    sub(st);
                    break;
                case "*":
                    mul(st);
                    break;
                case "/":
                    div(st);
                    break;
                default:
                    st.push(Long.parseLong(str));
            }
        }
        long ans = st.pop();
        return (int) ans;
    }

    void sub(Stack<Long> st) {
        long a = st.pop(), b = st.pop();
        st.push(b - a);
    }

    void add(Stack<Long> st) {
        long a = st.pop(), b = st.pop();
        st.push(a + b);
    }

    void mul(Stack<Long> st) {
        long a = st.pop(), b = st.pop();
        st.push(a * b);
    }

    void div(Stack<Long> st) {
        long a = st.pop(), b = st.pop();
        st.push(b / a);
    }
}

// Code by Md Zaid Alam