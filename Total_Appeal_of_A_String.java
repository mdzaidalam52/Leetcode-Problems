class Solution {
    public long appealSum(String s) {
        long ans = 0;
        long[] a = new long[26];
        long prev = 0;
        Arrays.fill(a, -1);
        for(long i = 0; i < s.length(); i++){
            if(a[s.charAt((int)i) - 'a'] == -1){
                prev += i+1;
            }else{
                prev += i - a[s.charAt((int)i) - 'a'];
            }
            a[s.charAt((int)i) - 'a'] = i;
            ans += prev;
        }
        return ans;
    }
}

// Code by Md Zaid Alam