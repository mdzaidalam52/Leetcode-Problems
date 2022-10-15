class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int mod = 1000000007;
        int[] pow = power(n);
        int[] res = new int[queries.length];
        int count = 0;
        for (int a[] : queries) {
            long ans = 1;
            for (int i = a[0]; i <= a[1]; i++) {
                ans = (ans * pow[i]) % mod;
            }
            res[count++] = (int) ans;
        }
        return res;
    }

    int[] power(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ind = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                arr.add((1 << ind));
            }
            n = n >> 1;
            ind++;
        }
        int[] a = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            a[i] = arr.get(i);
        }
        return a;
    }
}

// Code by Md Zaid Alam