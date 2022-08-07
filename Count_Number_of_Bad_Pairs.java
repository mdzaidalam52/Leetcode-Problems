class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        int n = nums.length;
        for(int i = n-1; i >= 0; i--){
            nums[i] -= i;
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            ans = ans + (i + 1 - map.get(nums[i]));
        }
        return ans;        
    }
}

// Code by Md Zaid Alam