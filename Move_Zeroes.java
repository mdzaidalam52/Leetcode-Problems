class Solution {
    public void moveZeroes(int[] nums) {
        int[] a = new int[nums.length];
        int j = 0, i = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                a[j] = nums[i];
                j++;
            }
            i++;
        }
        i = 0;
        for(int val : a){
            nums[i] = val;
            i++;
        }
    }
}

// Code by Md Zaid Alam