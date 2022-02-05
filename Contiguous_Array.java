class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] a = new int[2*n+1];
        Arrays.fill(a, -2);
        int ans = 0, count = 0;
        a[n] = -1;
        for(int i = 0; i < n; i++){
            count += nums[i] == 1 ? 1 : -1;
            if(a[count + n] == -2){
                a[count+n] = i;
            }else{
                ans = Math.max(ans, i - a[count+n]);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam