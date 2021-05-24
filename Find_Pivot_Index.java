class Solution {
    public int pivotIndex(int[] nums) {
        long sum = 0;
        for(int a : nums)
            sum += a;
        
        if(sum - nums[0] == 0)
            return 0;
        long left = 0, right = sum - nums[0];
        for(int i = 1; i < nums.length; i++){
            left += nums[i-1];
            right -= nums[i];
            if(left == right)
                return i;
        }
        return -1;
    }
}

// Code by Md Zaid Alam