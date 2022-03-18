class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(0);
            } else {
                int val = 0;
                while (!st.isEmpty() && st.peek() != 0)
                    val += st.pop();
                st.pop();
                st.push(Math.max(1, 2 * val));
            }
        }
        int ans = 0;
        while (!st.isEmpty())
            ans += st.pop();
        return ans;
    }
}

// Code by Md Zaid Alam