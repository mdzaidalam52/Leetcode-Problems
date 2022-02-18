class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int n = pairs.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int max = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(pairs[i][0] > pairs[j][1]){
                    ans[i] = Math.max(ans[i], ans[j] + 1);
                }
            }
            max = Math.max(ans[i], max);
        }
        return max;
    }
}

// Code by Md Zaid Alam