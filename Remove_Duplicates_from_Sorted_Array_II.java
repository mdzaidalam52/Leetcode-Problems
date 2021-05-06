class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count <= 2){
                    nums[length] = nums[i];
                    length++;
                }
            }else{
                count = 1;
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}

// Code by Md Zaid Alam