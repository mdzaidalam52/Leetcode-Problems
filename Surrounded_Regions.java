class Solution {
    public void solve(char[][] board) {
        int n = board.length, m = board[0].length;
        boolean[][] a = new boolean[n][m];
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            if(!vis[i][0]){
                vis[i][0] = true;
                if(board[i][0] == 'O'){
                    a[i][0] = true;
                    visit(board, i, 0, vis, a);
                }
            }
            
            if(!vis[i][m-1]){
                vis[i][m-1] = true;
                if(board[i][m-1] == 'O'){
                    a[i][m-1] = true;
                    visit(board, i, m-1, vis, a);
                }
            }
        }
        
        for(int i = 0; i < m; i++){
            if(!vis[0][i]){
                vis[0][i] = true;
                if(board[0][i] == 'O'){
                    a[0][i] = true;
                    visit(board, 0, i, vis, a);
                }
            }
            
            if(!vis[n-1][i]){
                vis[n-1][i] = true;
                if(board[n-1][i] == 'O'){
                    a[n-1][i] = true;
                    visit(board, n-1, i, vis, a);
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                board[i][j] = a[i][j] ? 'O' : 'X';
            }
        }
    }
    
    public void visit(char[][] board, int i, int j, boolean[][] vis, boolean[][] a){
        int n = board.length, m = board[0].length;
        if(i > 0 && !vis[i-1][j] && board[i-1][j] == 'O'){
            a[i-1][j] = true;
            vis[i-1][j] = true;
            visit(board, i-1, j, vis, a);
        }
        
        if(i < n-1 && !vis[i+1][j] && board[i+1][j] == 'O'){
            a[i+1][j] = true;
            vis[i+1][j] = true;
            visit(board, i+1, j, vis, a);
        }
        
        if(j > 0 && !vis[i][j-1] && board[i][j-1] == 'O'){
            a[i][j-1] = true;
            vis[i][j-1] = true;
            visit(board, i, j-1, vis, a);
        }
        
        if(j < m - 1 && !vis[i][j+1] && board[i][j+1] == 'O'){
            a[i][j+1] = true;
            vis[i][j+1] = true;
            visit(board, i, j+1, vis, a);
        }
    }
    
    
}

// Code by Md Zaid Alam