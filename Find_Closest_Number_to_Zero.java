class Solution {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];
        for(int i: nums){
            if(Math.abs(ans) == Math.abs(i) && i > 0){
                ans = i;
            }else if(Math.abs(ans) > Math.abs(i)){
                ans = i;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam