class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int ind = 1;
        int last = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(last != nums[i]){
                nums[ind] = nums[i];
                last = nums[i];
                ind++;
            }
        }
        return ind;
    }
    
}

// Code by Md Zaid Alam
