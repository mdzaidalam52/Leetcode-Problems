class Solution {
    public int minFlipsMonoIncr(String s) {
        int zero = 0, one = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') {
                zero++;
            }
        }
        int ans = zero;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                zero--;
            }
            ans = Math.min(one + zero, ans);
        }
        return ans;
    }
}

// Code by Md Zaid Alam