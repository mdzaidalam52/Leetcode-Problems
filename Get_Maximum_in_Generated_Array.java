class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int max = 1;
        int[] a = new int[n+1];
        a[1] = 1;
        for(int i = 2; i < n+1; i++){
            if((i&1) == 0)
                a[i] = a[(i >> 1)];
            else{
                a[i] = a[(i-1)/2] + a[(i+1)/2];
            }
            max = Math.max(max, a[i]);
        }
        return max;
    }
}

// Code by Md Zaid Alam