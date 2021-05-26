class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        for(int i = 0; i < points.length - 2; i++)
            for(int j = i+1; j < points.length - 1; j++)
                for(int k = j+1; k < points.length; k++)
                    ans = Math.max(area(points[i], points[j], points[k]), ans);
        return ans;
                
    }
    
    public double area(int[] a, int[] b, int[] c){
        return Math.abs(a[0]*(b[1] - c[1]) + b[0]*(c[1] - a[1]) + c[0]*(a[1] - b[1]))/2.0;
    }
    
}

// Code by Md Zaid Alam