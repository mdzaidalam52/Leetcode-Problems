class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        int count = 1 + check(pattern, 0);
        StringBuilder ans = new StringBuilder();
        boolean[] vis = new boolean[10];
        vis[count] = true;
        for (int i = 0; i < n; i++) {
            ans.append(count);
            vis[count] = true;
            if (pattern.charAt(i) == 'D') {
                count--;
            } else {
                while (vis[count]) {
                    count++;
                }
                count += check(pattern, i + 1);
            }
        }
        ans.append(count);
        return ans.toString();
    }

    int check(String s, int ind) {
        int ans = 0;
        for (int i = ind; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                ans++;
            } else {
                break;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam