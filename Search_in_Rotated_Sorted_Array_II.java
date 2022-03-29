class Solution {
    public boolean search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target || nums[s] == target || nums[e] == target) {
                return true;
            } else if (nums[mid] < nums[e]) {
                e = mid - 1;
            } else if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else {
                e--;
            }
        }
        int n = nums.length;
        e = s + nums.length - 1;
        while(s < e) {
            while(s < e && nums[(s + 1) % n] == nums[(s % n)]) s++;
            while(e >= s && nums[(e - 1) % n] == nums[(e % n)]) e--;
            if(s >= e) return nums[s] == target;
            int m = s + (e - s) / 2;
            int mModed = m % n;
            if (nums[mModed] == target) {
                return true;
            } else if(nums[mModed] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return nums[s % n] == target;
    }
}

// Code by Md Zaid Alam