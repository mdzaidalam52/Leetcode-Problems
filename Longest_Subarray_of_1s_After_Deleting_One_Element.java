class Solution {
    public int longestSubarray(int[] nums) {
        boolean bool = false;
        int count = 0;
        int prev = 0;
        int ans = 0;
        for(int i  = 0; i < nums.length; i++){
            if(nums[i] == 0){
            	bool = true;
                ans = Math.max(prev + count, ans);
                prev = count;
                count = 0;
            }else{
                count++;
            }
        }
        
        return bool ? Math.max(prev+count, ans) : nums.length - 1;
        
    }
}

// Code by Md Zaid Alam