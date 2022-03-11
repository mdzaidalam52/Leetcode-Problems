class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length <= 1)
            return false;
        int curr = nums[0] % k;
        int prev = 0;

        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 1; i < nums.length; i++) {
            set.add(prev);
            prev = curr;
            curr = (curr % k + nums[i] % k) % k;
            if (set.contains(curr))
                return true;
        }
        return false;
    }
}

// Code by Md Zaid Alam