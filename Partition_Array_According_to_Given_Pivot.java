class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i = 0, count = 0, j = 0;
        for (int a : nums) {
            if (a < pivot) {
                ans[i] = a;
                i++;
            } else if (a > pivot) {
                j++;
            }
        }
        count = j;
        for (int a : nums) {
            if (a > pivot) {
                ans[nums.length - j] = a;
                j--;
            }
        }

        for (int k = i; k < nums.length - count; k++) {
            ans[k] = pivot;
        }
        return ans;
    }
}

// Code by Md Zaid Alam