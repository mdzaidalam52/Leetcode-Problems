class Solution {
    public int minimumPartition(String s, int k) {
        int n = s.length(); 
        int[] a = new int[n+1];
        Arrays.fill(a, Integer.MAX_VALUE);
        if(k < 9){
            for(char c: s.toCharArray()){
                if(c-'0' > k){
                    return -1;
                }
            }
            return n;
        }
        a[n] = 0;
        for(int i = n-1; i >= 0; i--){
            for(int j = i+1; j <= n; j++){
                if(Long.valueOf(s.substring(i, j)) > k){
                    break;
                }else{
                    a[i] = Math.min(a[i], a[j]+1);
                }
            }
        }
        return a[0];
    }
}

// Code by Md Zaid Alam