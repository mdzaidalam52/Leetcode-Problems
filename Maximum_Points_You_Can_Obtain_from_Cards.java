class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans += cardPoints[i];
        }
        int l = ans, n = cardPoints.length;
        for(int i = 0; i < k; i++){
            l -= cardPoints[k-i-1];
            l += cardPoints[n-i-1];
            ans = Math.max(l, ans);
        }
        return ans;
    }
}

// Code by Md Zaid Alam