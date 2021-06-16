class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        int a = 0;
        for(int i : nums){
            a += (i & 1) == 0 ? i : 0;
        }
        
        for(int i = 0; i < queries.length; i++){
            if((nums[queries[i][1]] & 1) == 0)
                a -= nums[queries[i][1]];
            
            nums[queries[i][1]] += queries[i][0];
            
            if((nums[queries[i][1]] & 1) == 0)
                a += nums[queries[i][1]];
            
            ans[i] = a;
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam