class Solution {
    public int uniqueLetterString(String s) {
        int n = s.length();
        int[] prev = new int[n], next = new int[n], ind = new int[26];
        Arrays.fill(ind, -1);
        for(int i = 0; i < n; i++){
            prev[i] = ind[s.charAt(i) - 'A'];
            ind[s.charAt(i) - 'A'] = i;
        }

        Arrays.fill(ind, n);
        for(int i = n-1; i >= 0; i--){
            next[i] = ind[s.charAt(i) - 'A'];
            ind[s.charAt(i) - 'A'] = i;
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += ((i-prev[i]) * (next[i] - i));
        }
        return ans;
    }
}

// Code by Md Zaid Alam