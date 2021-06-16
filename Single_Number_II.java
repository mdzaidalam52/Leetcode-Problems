class Solution {
    public int singleNumber(int[] nums) {
        int[] bits = new int[32];
        
        for(int i = 0; i < 32; i++){
            for(int j = 0; j < nums.length; j++){
                bits[i] += (nums[j] & 1);
                nums[j] = nums[j] >> 1;
            }
        }
        
        int ans = 0;
        
        for(int i = 31; i >= 0; i--){
            ans += bits[i] % 3;
            if(i != 0)
                ans = ans << 1;
        }
        return ans;
    }
}

// Code by Md Zaid Alam