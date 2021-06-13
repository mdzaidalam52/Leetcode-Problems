class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        if(nums[0] < 0 && nums[nums.length-1] > 0){
            int i = 0, j = nums.length - 1;
            int k = ans.length - 1;
            while(i <= j){
                if(Math.abs(nums[i]) < nums[j]){
                    ans[k] = nums[j]*nums[j];
                    j--;
                }else{
                    ans[k] = nums[i]*nums[i];
                    i++;
                }        
                k--;
            }
        }else if(nums[0] < 0){
            for(int i = 0; i < ans.length; i++){
                ans[ans.length - 1 - i] = nums[i]*nums[i];
            }
        }else{
            for(int i = 0; i < nums.length; i++){
                ans[i] = nums[i]*nums[i];
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam