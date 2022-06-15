class Solution {
    int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        int[] arr = new int[k];
        solve(arr, 0, cookies);
        return ans;
    }

    void solve(int[] arr, int ind, int[] a) {
        if (ind == a.length) {
            int max = arr[0];
            for (int i : arr)
                max = Math.max(max, i);
            ans = Math.min(max, ans);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] += a[ind];
            solve(arr, ind + 1, a);
            arr[i] -= a[ind];
        }
    }
}

// Code by Md Zaid Alam