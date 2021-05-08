class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int total = 0;
        int ans = nums.length;
        int i = 0, j = 0;
        for(; i < nums.length; i++){
            sum += nums[i];
            total += nums[i];
            if(sum >= target){
                while(sum >= target && j < nums.length){
                    sum -= nums[j];
                    j++;
                }
                ans = Math.min(ans, j > i ? 1 : i - j + 2);
            }
        }
        return (total >= target) ? Math.max(ans, 1) : 0;
    }
}

// Code by Md Zaid Alam