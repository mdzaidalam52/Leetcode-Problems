class Solution {
    public int arrayNesting(int[] nums) {
        int ans = 0;
        boolean[] v = new boolean[nums.length];
        for(int i = 0; i < v.length; i++){
            if(!v[i]){
                int a = 0;
                int j = nums[i];
                while(!v[j]){
                    a++;
                    v[j] = true;
                    j = nums[j];
                }
                ans = Math.max(a, ans);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam