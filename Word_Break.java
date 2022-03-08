class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] ans = new boolean[s.length() + 1];
        ans[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (wordDict.contains(s.substring(j, i)) && ans[j]) {
                    ans[i] = true;
                    break;
                }
            }
        }
        return ans[s.length()];
    }
}

// Code by Md Zaid Alam