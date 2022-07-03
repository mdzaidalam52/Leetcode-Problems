class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int a = 0;
        int b = 0;
        int prev = 0;
        long mod = 1000000007;
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        for (int i : horizontalCuts) {
            a = Math.max(i - prev, a);
            prev = i;
        }
        a = Math.max(a, h - prev);
        prev = 0;
        for (int i : verticalCuts) {
            b = Math.max(i - prev, b);
            prev = i;
        }
        b = Math.max(b, w - prev);
        return (int) ((a % mod * b % mod) % mod);
    }
}

// Code by Md Zaid Alam