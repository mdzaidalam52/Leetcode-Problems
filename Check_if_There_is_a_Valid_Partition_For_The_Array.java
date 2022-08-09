class Solution {
    public boolean validPartition(int[] nums) {
        boolean[] a = new boolean[nums.length];
        return solve(nums, a, 0);
    }
    
    boolean solve(int[] a, boolean[] dp, int ind){
        if(ind == a.length)
            return true;
        if(ind == a.length-1)
            return false;
        if(dp[ind])
            return false;
        dp[ind] = true;
        if(a[ind] == a[ind+1]){
            if(solve(a, dp, ind+2))
                return true;
        }
        if(ind < a.length-2){
            if((a[ind] == a[ind+1] && a[ind+1] == a[ind+2]) || (a[ind] + 1 == a[ind+1] && a[ind] + 2 == a[ind+2])){
                if(solve(a, dp, ind+3))
                    return true;
            }
        }
        return false;
    }
}