class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum = 0;
        int t = 0;
        for (int i : colsum) {
            sum += i;
            t += i == 2 ? 1 : 0;
        }

        List<List<Integer>> ans = new ArrayList<>();
        if (upper + lower != sum || t > Math.min(lower, upper))
            return ans;
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 2) {
                ans.get(0).add(1);
                ans.get(1).add(1);
                upper--;
                lower--;
            } else {
                ans.get(0).add(0);
                ans.get(1).add(0);
            }
        }

        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] == 1) {
                if (upper > 0) {
                    ans.get(0).set(i, 1);
                    upper--;
                } else {
                    ans.get(1).set(i, 1);
                    lower--;
                }
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam