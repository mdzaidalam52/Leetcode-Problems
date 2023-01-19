class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, ans = 0;
        for (int i : nums) {
            sum += i;
            if (sum < 0) {
                sum += ((-(sum / k)) * k) + k;
            }
            sum %= k;
            ans += map.getOrDefault(sum, 0);
            if (sum == 0)
                ans++;
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}

// Code by Md Zaid Alam