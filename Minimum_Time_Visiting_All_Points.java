class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 1; i < points.length; i++){
            int x = Math.abs(points[i-1][0] -points[i][0]);
            int y = Math.abs(points[i-1][1] - points[i][1]);
            ans += Math.min(x, y) + Math.abs(x - y);
        }
        return ans;
    }
}

// Code by Md Zaid Alam