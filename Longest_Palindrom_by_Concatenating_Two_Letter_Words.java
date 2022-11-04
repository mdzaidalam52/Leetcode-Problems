class Solution {
    public int longestPalindrome(String[] words) {
        int ans = 0;
        int[] bool = new int[2526];
        int pal = 0;
        for (String str : words) {
            int k = check(str);
            if (bool[(k % 100) * 100 + k / 100] > 0) {
                bool[(k % 100) * 100 + k / 100]--;
                ans += 2;
                if (k / 100 == k % 100) {
                    pal--;
                }
                continue;
            } else if (k / 100 == k % 100) {
                pal++;
            }
            bool[k]++;
        }
        if (pal > 0) {
            ans++;
        }
        return ans * 2;
    }

    int check(String str) {
        return (str.charAt(1) - 'a') + 100 * (str.charAt(0) - 'a');
    }
}

// Code by Md Zaid Alam