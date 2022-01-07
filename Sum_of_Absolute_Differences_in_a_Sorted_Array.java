class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[n-1] - nums[i];
        }
        ans[n-1] = sum;
        for(int i = n-2; i >= 0; i--){
            int k = nums[i+1] - nums[i];
            sum -= k * (i+1);
            sum += k * (n - 1 - i);
            ans[i] = sum;
        }
        return ans;
    }
}

// Code by Md Zaid Alam