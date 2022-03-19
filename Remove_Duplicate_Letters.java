class Solution {
    public String removeDuplicateLetters(String s) {
        int[] ind = new int[26];
        boolean[] vis = new boolean[26];
        for (int i = 0; i < s.length(); i++)
            ind[s.charAt(i) - 'a'] = i;
        Stack<Integer> st = new Stack();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (vis[c])
                continue;
            while (!st.isEmpty() && st.peek() > c && i < ind[st.peek()])
                vis[st.pop()] = false;
            st.push(c);
            vis[c] = true;
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty())
            ans.append((char) (st.pop() + 'a'));
        return ans.reverse().toString();
    }

}

// Code by Md Zaid Alam