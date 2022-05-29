class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            for(char c: words[i].toCharArray()){
                a[i] = a[i] | (1 << (c-'a'));
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((a[i]&a[j]) == 0)
                    ans = Math.max(ans, words[i].length() * words[j].length());
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam