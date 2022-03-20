class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans = Integer.MAX_VALUE;
        int n = tops.length;
        for (int i = 1; i < 7; i++) {
            boolean bool = true;
            int top = 0, bottom = 0;
            for (int j = 0; j < n; j++) {
                if (tops[j] != i && bottoms[j] != i) {
                    bool = false;
                    break;
                }
                if (tops[j] != i) {
                    top++;
                }
                if (bottoms[j] != i) {
                    bottom++;
                }
            }
            if (bool) {
                ans = Math.min(Math.min(top, bottom), ans);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}

// Code by Md Zaid Alam