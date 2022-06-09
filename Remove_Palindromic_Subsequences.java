class Solution {
    public int removePalindromeSub(String s) {
        if (palindrome(s))
            return 1;
        return 2;
    }

    boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        return true;
    }
}

// Code by Md Zaid Alam