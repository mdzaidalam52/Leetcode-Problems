class Solution {
    public int longestArithSeqLength(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int n = nums.length;
        if (n == 2)
            return 2;
        int ans = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int d = nums[i] - nums[j];
                if (!map.containsKey(d))
                    map.put(d, new int[n]);
                map.get(d)[i] = map.get(d)[j] + 1;
                ans = Math.max(ans, map.get(d)[i] + 1);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam