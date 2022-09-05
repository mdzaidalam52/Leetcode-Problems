class Solution {
    public int longestNiceSubarray(int[] nums) {
        int[] a = new int[32];
        Arrays.fill(a, -1);
        int ans = 0;
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            int ind = 0;
            while(ind < 32){
                if((nums[i]&(1 << ind)) != 0){
                    max = Math.max(a[ind], max);
                    a[ind] = i;
                }
                ind++;
            }
            
            int min = nums.length;
            for(int j = 0; j < 32; j++){
                if(a[j] <= max){
                    a[j] = -1;
                }else{
                    min = Math.min(min, a[j]);
                }
            }
            ans = Math.max(ans, i - min + 1);
        }
        return ans;
    }
}

// Code by Md Zaid Alam