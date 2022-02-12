class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0, ans = 0, n = nums.length;
        m.put(0, 1);
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(m.containsKey(sum-k)){
                ans += m.get(sum - k);
            }
            m.put(sum, m.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}

// Code by Md Zaid Alam