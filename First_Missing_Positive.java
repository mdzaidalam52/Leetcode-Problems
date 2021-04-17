class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] a = new int[301];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 301 && nums[i] >= 0){
                a[nums[i]] = 1;
            }
        }
        for(int i = 1; i < a.length; i++){
            if(a[i] == 0){
                return i;
            }
        }
        return 301;
    }
}

// Code by Md Zaid Alam