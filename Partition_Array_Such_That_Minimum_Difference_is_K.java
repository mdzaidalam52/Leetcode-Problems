class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int last = nums[0];
        int ans = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - last > k){
                ans++;
                last = nums[i];
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam