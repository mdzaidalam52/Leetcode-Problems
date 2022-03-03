class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0, j = 0;
        while (nums[i] < 0)
            i++;
        while (nums[j] > 0)
            j++;

        for (int k = 0; k < n; k += 2) {
            ans[k] = nums[i];
            ans[k + 1] = nums[j];
            i++;
            j++;
            while (i < n && nums[i] < 0)
                i++;
            while (j < n && nums[j] > 0)
                j++;
        }
        return ans;
    }
}

//Code by Md Zaid Alam