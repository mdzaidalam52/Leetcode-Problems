class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int r = m, c = n;
        for(int[] a: ops){
            r = Math.min(a[0], r);
            c = Math.min(a[1], c);
        }
        return r*c;
    }
}

// Code by Md Zaid Alam