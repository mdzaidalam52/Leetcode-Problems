class Solution {
    public int minBitFlips(int start, int goal) {
        int a = Math.max(start, goal);
        int b = Math.min(start, goal);
        int ans = 0;
        while (a != 0) {
            if ((a & 1) != (b & 1))
                ans++;
            a = a >> 1;
            b = b >> 1;
        }
        return ans;
    }
}

// Code by Md Zaid Alam