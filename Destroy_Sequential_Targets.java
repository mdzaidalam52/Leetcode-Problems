class Solution {
    public int destroyTargets(int[] nums, int space) {
        HashMap<Integer, Integer> arr = new HashMap<>(), root = new HashMap<>();

        int max = 0, ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            arr.put(nums[i] % space, arr.getOrDefault(nums[i] % space, 0) + 1);
            root.put(nums[i] % space, Math.min(root.getOrDefault(nums[i] % space, Integer.MAX_VALUE), nums[i]));
            if (max == arr.get(nums[i] % space)) {
                ans = Math.min(ans, root.get(nums[i] % space));
            } else if (max < arr.get(nums[i] % space)) {
                ans = root.get(nums[i] % space);
                max = arr.get(nums[i] % space);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam