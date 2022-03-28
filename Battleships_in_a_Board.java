class Solution {
    public int countBattleships(char[][] board) {
        int ans = 0;
        int n = board.length, m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'X' && !vis[i][j]){
                    ans++;
                    vis[i][j] = true;
                    int k = i+1;
                    while(k < n && board[k][j] == 'X'){
                        vis[k][j] = true;
                        k++;
                    }
                    k = j+1;
                    while(k < m && board[i][k] == 'X'){
                        vis[i][k] = true;
                        k++;
                    }
                }
            }
        }
        return ans;
    }
}