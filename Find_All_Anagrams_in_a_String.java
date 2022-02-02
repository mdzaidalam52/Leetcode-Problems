class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] a = new int[26];
        int[] b = new int[26];
        for(char c: p.toCharArray()){
            a[c-'a']++;
        }
        for(int i = 0; i < Math.min(p.length(), s.length()); i++){
            b[s.charAt(i) - 'a']++;
        }
        if(check(a, b))
            ans.add(0);
        
        for(int i = p.length(); i < s.length(); i++){
            b[s.charAt(i - p.length()) - 'a']--;
            b[s.charAt(i) - 'a']++;
            if(check(a, b))
                ans.add(i - p.length() + 1);
        }
        return ans;
    }
    boolean check(int[] a, int[] b){
        for(int i = 0; i < 26; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}

// Code by Md Zaid Alam