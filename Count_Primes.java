class Solution {
    public int countPrimes(int n) {
        boolean[] a = new boolean[n+1];
        for(int i = 2; i*i <= n; i++){
            if(a[i]){
                continue;
            }
            for(int j = i*i; j <= n; j += i){
                a[j] = true;
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!a[i]){
                count++;
            }
        }
        return count;
    }
}

// Code by Md Zaid Alam