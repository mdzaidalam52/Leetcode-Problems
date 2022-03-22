class Solution {
    public int countCollisions(String directions) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for (char c : directions.toCharArray()) {
            if (st.isEmpty()) {
                if (c != 'L')
                    st.push(c);
            } else if (c == 'R') {
                st.push('R');
            } else if (c == 'L') {
                while (!st.isEmpty() && st.peek() == 'R') {
                    st.pop();
                    ans++;
                }
                ans++;
                st.push('S');
            } else {
                while (!st.isEmpty() && st.peek() == 'R') {
                    st.pop();
                    ans++;
                }
                st.push('S');
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam