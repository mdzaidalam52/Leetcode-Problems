class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int[] ans = new int[n+1];
        int[] b = new int[n+1];
        int max = 0;
        for(int i = n-1; i >= 0; i--){
            b[i] = b[i+1] + satisfaction[i];
            ans[i] = ans[i+1] + b[i];
            max = Math.max(ans[i], max);
        }
        return max;
    }
}

// Code by Md Zaid Alam