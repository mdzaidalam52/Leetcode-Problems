class Solution {
    public int[] productExceptSelf(int[] nums) {
        long product = 1;
        int z = 0;
        for(int i : nums)
            if(i == 0)
                z++;
            else
                product *= i;
        int[] ans = new int[nums.length];
        if(z == 1){
            for(int i = 0; i < nums.length; i++){
                if(nums[i] != 0){
                    ans[i] = 0;
                }else{
                    ans[i] = (int)product;
                }
            }
        }else if(z == 0){
            for(int i = 0; i < nums.length; i++)
                ans[i] = (int)(product/nums[i]);
        }
        return ans;
    }
}

// Code by Md Zaid Alam