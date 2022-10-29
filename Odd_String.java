class Solution {
    public String oddString(String[] words) {
        int[] a = check(words[0]);
        for (int i = 1; i < words.length; i++) {
            int[] k = check(words[i]);
            for (int j = 0; j < 26; j++) {
                if (a[j] != k[j]) {
                    if (i > 1) {
                        return words[i];
                    } else {
                        int[] l = check(words[2]);
                        for (int m = 0; m < 26; m++) {
                            if (l[m] != a[m]) {
                                return words[0];
                            }
                        }
                        return words[1];
                    }
                }
            }
        }
        return null;

    }

    int[] check(String a) {
        int[] ans = new int[26];
        for (int i = 0; i < a.length() - 1; i++) {
            ans[i] = a.charAt(i + 1) - a.charAt(i);
        }
        return ans;
    }
}

// Code by Md Zaid Alam