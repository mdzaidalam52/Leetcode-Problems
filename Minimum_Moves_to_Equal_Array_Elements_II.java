class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med = nums[nums.length/2];
        int ans =0;
        for(int i : nums)
        {
            ans+=Math.abs(med-i);
        }
        return ans;
    }
}

// Code by Md Zaid Alam