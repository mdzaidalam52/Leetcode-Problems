class Solution {
    public int longestStrChain(String[] words) {
        int n = words.length;
        int[] ans = new int[n];
        int max = 1;
        Arrays.fill(ans, 1);
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n; j++){
                if(check(words[i], words[j])){
                    ans[i] = Math.max(ans[i], ans[j] + 1);
                }
            }
            max = Math.max(ans[i], max);
        }
        return max;
    }
    
    boolean check(String a, String b){
        if(a.length() != b.length() + 1){
            return false;
        }
        int count = 0;
        for(int i = 0; i < a.length() && count < b.length(); i++){
            if(a.charAt(i) == b.charAt(count)){
                count++;
            }
        }
        return count == b.length();
    }
}

// Code by Md Zaid Alam