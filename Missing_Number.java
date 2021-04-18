class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        n = (n*(n+1))/2;
        for(int val : nums){
            n -= val;
        }
        return n;
    }
}

// Code by Md Zaid Alam