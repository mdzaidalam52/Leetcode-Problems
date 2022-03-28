class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Data> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Data(i));
            for (int j = 0; j < m; j++) {
                arr.get(i).val += mat[i][j];
            }
        }
        Collections.sort(arr, (a, b) -> {
            if (a.val != b.val)
                return a.val - b.val;
            return a.ind - b.ind;
        });
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr.get(i).ind;
        }
        return ans;
    }

    class Data {
        int val, ind;

        Data(int ind) {
            this.ind = ind;
            this.val = 0;
        }
    }
}

// Code by Md Zaid Alam