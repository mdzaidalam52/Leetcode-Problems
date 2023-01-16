class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        char[] a = new char[26];
        for (int i = 0; i < 26; i++) {
            a[i] = (char) ('a' + i);
        }
        for (int i = 0; i < s1.length(); i++) {
            check(a, s1.charAt(i), s2.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            ans.append(find(a, c));
        }
        return ans.toString();
    }

    void check(char[] a, char c, char d) {
        char e = find(a, c);
        char f = find(a, d);
        if (a[e - 'a'] < a[f - 'a']) {
            a[f - 'a'] = a[e - 'a'];
        } else {
            a[e - 'a'] = a[f - 'a'];
        }
    }

    char find(char[] a, char c) {
        while (a[c - 'a'] != c) {
            c = a[c - 'a'];
        }
        return c;
    }
}

// Code by Md Zaid Alam