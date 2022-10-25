class Solution {
    public int longestPalindrome(String s) {
        int[] a = new int[128];
        for (char c : s.toCharArray()) {
            a[c]++;
        }
        Arrays.sort(a);
        int ans = 0;
        boolean odd = false;
        for (int i = 127; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                ans += a[i];
            } else if (!odd) {
                ans += a[i];
                odd = true;
            } else {
                ans += a[i] - 1;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam