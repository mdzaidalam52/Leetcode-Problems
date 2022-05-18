class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        boolean[][] vis = new boolean[n][n];
        Queue<Data> q = new LinkedList<>();
        q.add(new Data(0, 0));
        int ans = -1;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return ans;
        int k = 1;
        vis[0][0] = true;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- > 0){
                Data d = q.remove();
                if(d.x == n-1 && d.y == n-1){
                    return k;
                }
                int x = d.x, y = d.y;
                if(x+1 < grid.length && grid[x+1][y] == 0 && !vis[x+1][y]){
                    vis[x+1][y] = true;
                    q.add(new Data(x+1, y));
                }
                
                if(y+1 < grid[0].length && grid[x][y+1] == 0 && !vis[x][y+1]){
                    vis[x][y+1] = true;
                    q.add(new Data(x, y+1));
                }
                
                if(x-1 >= 0 && grid[x-1][y] == 0 && !vis[x-1][y]){
                    vis[x-1][y] = true;
                    q.add(new Data(x-1, y));
                }
                
                if(y-1 >= 0 && grid[x][y-1] == 0 && !vis[x][y-1]){
                    vis[x][y-1] = true;
                    q.add(new Data(x, y-1));
                }
                
                if(x+1 < grid.length && y+1 < grid[0].length && grid[x+1][y+1] == 0 && !vis[x+1][y+1]){
                    vis[x+1][y+1] = true;
                    q.add(new Data(x+1, y+1));
                }
                
                if(x-1 >= 0 && y+1 < grid[0].length && grid[x-1][y+1] == 0 && !vis[x-1][y+1]){
                    vis[x-1][y+1] = true;
                    q.add(new Data(x-1, y+1));
                }
                
                if(x+1 < grid.length && y-1>=0 && grid[x+1][y-1] == 0 && !vis[x+1][y-1]){
                    vis[x+1][y-1] = true;
                    q.add(new Data(x+1, y-1));
                }
                
                if(x-1 >= 0 && y-1 >= 0 && grid[x-1][y-1] == 0 && !vis[x-1][y-1]){
                    vis[x-1][y-1] = true;
                    q.add(new Data(x-1, y-1));
                }
            }
            k++;
        }
        return ans;
    }
    
    class Data{
        int x, y;
        Data(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}

// Code by Md Zaid Alam