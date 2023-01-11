class Solution {
    public int maxPoints(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        int ans = 2;
        if (points.length == 1)
            return 1;
        for (int i = 0; i < points.length; i++) {
            boolean[] checked = new boolean[points.length];
            for (int j = i + 1; j < points.length; j++) {
                if (checked[j]) {
                    continue;
                }
                int count = 2;
                int a = points[i][0] - points[j][0];
                int b = points[i][1] - points[j][1];
                for (int k = j + 1; k < points.length; k++) {
                    if (a * (points[i][1] - points[k][1]) == b * (points[i][0] - points[k][0])) {
                        count++;
                        checked[k] = true;
                    }
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam