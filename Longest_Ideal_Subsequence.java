class Solution {
    public int longestIdealString(String s, int k) {
        int[] a = new int[s.length()];
        Arrays.fill(a, 1);
        int[] ind = new int[26];
        Arrays.fill(ind, -1);
        for(int i = s.length() - 1; i >= 0; i--){
            for(int j = Math.max('a', s.charAt(i) - k); j <= Math.min('z', s.charAt(i)+k); j++){
                if(ind[j-'a'] != -1){
                    a[i] = Math.max(a[i], a[ind[j-'a']] + 1);
                }
            }
            ind[s.charAt(i) - 'a'] = i;
        }
        int max = 1;
        for(int i: a){
            max = Math.max(i, max);
        }
        return max;
    }
}

// Code by Md Zaid Alam