class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0]-b[0]);
        int max = 0;
        int n = points.length;
        for(int i = 0; i < n-1; i++){
            max = Math.max(max, points[i+1][0] - points[i][0]);
        }
        return max;
    }
}

// Code by Md Zaid Alam