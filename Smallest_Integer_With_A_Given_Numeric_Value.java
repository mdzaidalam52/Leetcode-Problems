class Solution {
    public String getSmallestString(int n, int k) {
        char[] c = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            if (k == i + 1) {
                c[i] = 'a';
                k--;
            } else if (k - i >= 26) {
                c[i] = 'z';
                k -= 26;
            } else {
                c[i] = (char) ('a' + (k - i - 1));
                k = i;
            }
        }
        return new String(c);
    }
}

// Code by Md Zaid Alam