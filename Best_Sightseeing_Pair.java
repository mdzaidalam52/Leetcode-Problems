class Solution {
    public int maxScoreSightseeingPair(int[] values) {        
        int val = values[0];
        int ans = Integer.MIN_VALUE;
        for(int i = 1; i < values.length; i++){
            ans = Math.max(val - 1 + values[i], ans);
            val = Math.max(val-1, values[i]);
        }
        return ans;
    }
}

// Code by Md Zaid Alam