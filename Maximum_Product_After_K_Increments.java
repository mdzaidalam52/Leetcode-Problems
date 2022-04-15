class Solution {
    public int maximumProduct(int[] nums, int k) {
        Arrays.sort(nums);
        int c = nums[0];
        int mod = 1000000007;
        int ind = 0;
        while(k-- > 0){
            if(ind < nums.length && nums[ind] == c){
                nums[ind++]++;
            }else{
                nums[0]++;
                ind = 1;
                c++;
            }
        }
        long ans = 1;
        for(int i: nums){
            ans = (ans * (i%mod))%mod;
        }
        return (int)ans;
    }
}

// Code by Md Zaid Alam