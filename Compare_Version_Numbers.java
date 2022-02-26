class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        int len = Math.max(a.length, b.length);

        for (int i = 0; i < len; i++) {
            int n = (i >= a.length) ? 0 : Integer.parseInt(a[i]);
            int m = (i >= b.length) ? 0 : Integer.parseInt(b[i]);
            if (n > m)
                return 1;
            else if (n < m)
                return -1;
        }
        return 0;
    }
}

// Code by Md Zaid Alam