class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(a);
        for(int i = 0; additionalRocks > 0 && i < n; i++){
            int k = Math.min(a[i], additionalRocks);
            a[i] -= k;
            additionalRocks -= k;
        }
        int ans = 0;
        for(int i: a){
            if(i != 0)
                break;
            ans++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam