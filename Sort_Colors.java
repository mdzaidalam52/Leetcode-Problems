class Solution {
    public void sortColors(int[] nums) {
        int r = 0, w = 0;
        for(int val : nums)
            if(val == 0)
                r++;
            else if(val == 1)
                w++;
        
        for(int i = 0; i < r; i++) nums[i] = 0;
        for(int i = r; i < w + r; i++) nums[i] = 1;
        for(int i = r + w; i < nums.length; i++) nums[i] = 2;
    }
}

// Code by Md Zaid Alam