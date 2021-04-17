class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<point> pq = new PriorityQueue<>();
        for(int i = 0; i < points.length; i++){
            pq.add(new point(points[i][0], points[i][1]));
        }
        
        int[][] ans = new int[K][2];
        point a;
        for(int i = 0; i < K; i++){
            a = pq.poll();
            ans[i][0] = a.x;
            ans[i][1] = a.y;
            
        }
        
        return ans;
    }
}

class point implements Comparable<point>{
    int x, y;
    point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int compareTo(point a){
        return (x*x + y*y) - (a.x*a.x + a.y*a.y);
    }
}

// Code by Md Zaid Alam