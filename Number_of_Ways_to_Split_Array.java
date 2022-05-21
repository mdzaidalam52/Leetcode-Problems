class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] l = new long[n], r = new long[n];
        l[0] = nums[0];
        r[n-1] = nums[n-1];
        for(int i = 1; i < n; i++){
            l[i] = nums[i] + l[i-1];
            r[n-i-1] = nums[n-i-1] + r[n-i];
        }
        int ans = 0;
        for(int i = 0; i < n-1; i++){
            if(l[i] >= r[i+1])
                ans++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam