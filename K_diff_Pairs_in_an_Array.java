class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = 1;
        int ans = 0;
        while(j < nums.length && i < nums.length){
            if(nums[j] - nums[i] == k){
                int a = 1, b = 1;
                while(i + a < nums.length && nums[i] == nums[i+a]) a++;
                while(b + j < nums.length && nums[j] == nums[b+j]) b++;
                i += a;
                j += b;
                ans++;
            }else if(nums[j] - nums[i] > k){
                i++;
            }else{
                j++;
            }
            if(i == j) j++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam