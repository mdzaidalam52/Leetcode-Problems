class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int ans = 0;
        for(int i = n-2; i >= n/3; i -= 2){
            ans += piles[i];
        }
        return ans;
    }
}

// Code By Md Zaid Alam