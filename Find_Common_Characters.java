class Solution {
    public List<String> commonChars(String[] words) {
        int[] a;
        int[] ans = new int[26];
        for(int i = 0; i < words[0].length(); i++){
            ans[words[0].charAt(i) - 'a']++;
        }
        for(int i = 1; i < words.length; i++){
            a = new int[26];
            for(int j = 0; j < words[i].length(); j++){
                a[words[i].charAt(j) - 'a']++;
            }
            for(int j = 0; j < 26; j++){
                ans[j] = Math.min(a[j], ans[j]);
            }
        }
        List<String> str = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < ans[i]; j++){
                str.add(Character.toString(i + 'a'));
            }
        }
        return str;
    }
}

// Code by Md Zaid Alam