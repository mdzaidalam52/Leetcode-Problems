class Solution {
    public long numberOfWays(String s) {
        int n = s.length();
        long[] a = new long[n], b = new long[n];
        if(s.charAt(0) == '1')
            a[0] = 1;
        else
            b[0] = 1;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) == '1'){
                a[i] = a[i-1] + 1;
                b[i] = b[i-1];
            }else{
                a[i] = a[i-1];
                b[i] = b[i-1] + 1;
            }
        }
        long ans = 0;
        for(int i = 1; i < n - 1; i++){
            if(s.charAt(i) == '1')
                ans += b[i] * (b[n - 1] - b[i]);
            else
                ans += a[i] * (a[n - 1] - a[i]);
        }
        return ans;
    }
}