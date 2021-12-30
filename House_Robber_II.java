class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        if(n == 1)
            return nums[0];
        int[] first = new int[n+1];
        int[] last = new int[n+1];
        first[1] = nums[0];
        last[n-1] = nums[n-1];
        for(int i = 2; i < n; i++){
            first[i] = Math.max(first[i-1], first[i-2] + nums[i-1]);
        }
        for(int i = n-2; i > 0; i--){
            last[i] = Math.max(last[i+1], last[i+2] + nums[i]);
        }
        
        return Math.max(last[1], first[n-1]);
        
    }
}

// Code by Md Zaid Alam