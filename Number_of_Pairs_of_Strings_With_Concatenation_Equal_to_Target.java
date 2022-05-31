class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if((nums[i]+nums[j]).equals(target)){
                    ans++;
                }
                if((nums[j]+nums[i]).equals(target)){
                    ans++;
                }
                
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam