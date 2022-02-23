class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int s = 0, e = 0;
        while(e < nums.length){
            if(nums[e] == 1){
                ans = Math.max(ans, e-s+1);
                e++;
            }else if(k > 0){
                k--;
                ans = Math.max(ans, e-s+1);
                e++;
            }else if(s == e){
                e++;
                s++;
            }else{
                if(nums[s] == 0)
                    k++;
                s++;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam