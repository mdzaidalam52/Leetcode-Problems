class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        Data[] a = new Data[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Data(costs[i][1] - costs[i][0], i);
        }
        Arrays.sort(a, (b, c) -> b.val - c.val);
        int ans = 0;
        for (int i = 0; i < n / 2; i++) {
            ans += costs[a[i].ind][1];
        }
        for (int i = n / 2; i < n; i++) {
            ans += costs[a[i].ind][0];
        }
        return ans;
    }

    class Data {
        int val, ind;

        Data(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }
    }
}

// Code by Md Zaid Alam