class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int min = 0, max = 0;
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) == 'I') {
                ans[i] = ++max;
            } else {
                ans[i] = --min;
            }
        }
        for (int i = 0; i <= n; i++) {
            ans[i] -= min;
        }
        return ans;
    }
}

// Code by Md Zaid Alam