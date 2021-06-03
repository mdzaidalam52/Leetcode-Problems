class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        int count;
        for(int i = 0; i <= n; i++){
            count = i;
            while(count != 0){
                ans[i] += (count&1);
                count = count >> 1;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam
