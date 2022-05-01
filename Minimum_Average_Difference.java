class Solution {
    public int minimumAverageDifference(int[] nums) {
        long min = Long.MIN_VALUE;
        int ind = 0;
        long a = nums[0], b = 0;
        for (int i = 1; i < nums.length; i++) {
            b += nums[i];
        }
        if (nums.length == 1)
            return 0;
        min = Math.abs(a - (b / (nums.length - 1)));
        for (int i = 1; i < nums.length - 1; i++) {
            a += nums[i];
            b -= nums[i];
            if (min > Math.abs(a / (i + 1) - b / (nums.length - i - 1))) {
                min = Math.abs(a / (i + 1) - b / (nums.length - i - 1));
                ind = i;
            }
        }
        if (min > (a + nums[nums.length - 1]) / nums.length)
            return nums.length - 1;
        return ind;
    }
}

// Code by Md Zaid Alam