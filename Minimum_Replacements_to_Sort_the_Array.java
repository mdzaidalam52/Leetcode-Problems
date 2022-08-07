class Solution {
    public long minimumReplacement(int[] nums) {
        int n = nums.length;
        long ans = 0;
        long prev = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            if(nums[i] > prev){
                if(prev >= nums[i] - (nums[i]/2)){
                    ans++;
                    prev = nums[i]/2;
                }else{
                    long k = (nums[i] % prev == 0 ? ((nums[i]/prev)-1) : (nums[i]/prev));
                    ans = (ans + k);
                    if(nums[i] % prev != 0){
                        prev = nums[i]/(k+1);
                    }
                }
            }else{
                prev = nums[i];
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam