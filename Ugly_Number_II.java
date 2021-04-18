class Solution {
    public int nthUglyNumber(int n) {
        int[] a = new int[n+1];
        a[1] = 1;
        int i = 1, j = 1, k = 1;
        int nxt2 = 2, nxt3 = 3, nxt5 = 5;
        for(int x = 2; x <= n; x++){
            int m = Math.min(nxt2, Math.min(nxt3, nxt5));
            a[x] = m;
            if(m == nxt2){
                i++;
                nxt2 = a[i]*2;
            }
            if(m == nxt3){
                j++;
                nxt3 = a[j]*3;
            }
            if(m == nxt5){
                k++;
                nxt5 = a[k]*5;
            }
        }
        return a[n];
    }
}

// Code by Md Zaid Alam