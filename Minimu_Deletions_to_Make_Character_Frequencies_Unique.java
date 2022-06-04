class Solution {
    public int minDeletions(String s) {
        int[] a = new int[26];
        for(char c: s.toCharArray()){
            a[c-'a']++;
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i = 24; i >= 0 && a[i] > 0; i--){
            if(a[i] >= a[i+1]){
                if(a[i+1] == 0){
                    ans += a[i];
                    a[i] = 0;
                }else{
                    ans += a[i] - a[i+1] + 1;
                    a[i] = a[i+1] - 1;
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam