class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3)
            return 0;
        int count = 2;
        int ans = 0;
        int d = nums[1] - nums[0];
        for(int i = 2; i < nums.length; i++){
            if(nums[i] - nums[i - 1] == d){
                count++;
            }else{
                if(count > 2){
                    ans += calc(count);
                }
                d = nums[i] - nums[i-1];
                count = 2;
                
            }
        }
        if(count > 2)
            ans += calc(count);
        return ans;
    }
    public int calc(int a){
        return (a-1)*(a-2)/2;
    }
}

// Code by Md Zaid Alam