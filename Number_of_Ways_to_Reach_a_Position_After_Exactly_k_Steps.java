class Solution {
    public int numberOfWays(int startPos, int endPos, int k) {
        if(k % 2 != Math.abs(startPos-endPos)%2 || k < Math.abs(startPos - endPos)){
            return 0;
        }
        final long mod = 1000000007;
        long ans = nCrModp(k, (k - Math.abs(endPos - startPos))/2 + Math.abs(endPos - startPos), mod);
        
        return (int)ans;
        
    }
    
    long nCrModp(long n, long r, long p){
        if (r > n - r)
            r = n - r;
        long C[] = new long[(int)r + 1];
 
        C[0] = 1; 
        for (int i = 1; i <= n; i++) {
            for (int j = (int)Math.min(i, r); j > 0; j--)
                C[j] = (C[j] + C[j - 1]) % p;
        }
        return (int)C[(int)r];
    }
}

// Code by Md Zaid Alam