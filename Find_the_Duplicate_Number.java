class Solution {
    public int findDuplicate(int[] nums) {
        int[] a = new int[nums.length-1];
        for(int val : nums){
            a[val - 1]++;
            if(a[val-1] == 2){
                return val;
            }
        }
        return -1;
    }
}

// Code by Md Zaid Alam