class Solution {
    public int removeElement(int[] nums, int val) {
        int ind = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                ind++;
            }else{
                nums[i - ind] = nums[i];
            }
        }
        
        return nums.length - ind;
    }
}

// Code by Md Zaid Alam