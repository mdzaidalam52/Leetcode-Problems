class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int[] a = time(event1);
        int[] b = time(event2);
        if (a[0] > b[0]) {
            int[] t = a;
            a = b;
            b = t;
        }
        return a[1] >= b[0];
    }

    int[] time(String[] event) {
        int[] ans = new int[2];
        for (int i = 0; i < 2; i++) {
            ans[i] = Integer.parseInt(event[i].substring(0, 2)) * 60 + Integer.parseInt(event[i].substring(3));
        }
        return ans;
    }
}

// Code by Md Zaid Alam