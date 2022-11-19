class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i: nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return gcd(min, max);
    }

    int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
}

// Code by Md Zaid Alam