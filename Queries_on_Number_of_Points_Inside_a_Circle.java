class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            for(int[] p: points){
                if(check(p, queries[i]))
                    ans[i]++;
            }
        }
        return ans;
    }
    boolean check(int[] p, int[] q){
        long x = p[0]-q[0], y = p[1]-q[1], r = q[2];
        return x*x + y*y <= r*r;
    }
}

// Code by Md Zaid Alam