class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        if (n == 1)
            return true;
        return check(s, 0, n - 1, false);
    }

    public boolean check(String str, int s, int e, boolean deleted) {
        while (s < e) {
            if (str.charAt(s) == str.charAt(e)) {
                s++;
                e--;
            } else if (!deleted) {
                if (str.charAt(s) == str.charAt(e - 1) && check(str, s, e - 1, true)) {
                    return true;
                } else if (str.charAt(e) == str.charAt(s + 1)) {
                    return check(str, s + 1, e, true);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

// Code by Md Zaid Alam