class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int ind = 0;
        for (int i = 0; i < pushed.length; i++) {
            st.push(pushed[i]);
            while (ind < popped.length && !st.isEmpty() && popped[ind] == st.peek()) {
                st.pop();
                ind++;
            }
        }
        return ind == popped.length;
    }
}

// Code by Md Zaid Alam