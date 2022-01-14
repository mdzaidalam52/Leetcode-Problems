class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < points.length; i++){
            if(min < points[i][0]){
                ans++;
                min = points[i][1];
            }else{
                min = Math.min(min, points[i][1]);
            }
        }
        ans++;
        return ans;
    }
}

// Code by Md Zaid Alam