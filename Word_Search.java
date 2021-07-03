class Solution {
    public boolean exist(char[][] board, String word) {
		boolean[][] vis = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
            	vis[i][j] = true;
                if(board[i][j] == word.charAt(0) && check(board, i, j, 1, word, vis)){
                    return true;
                }
                vis[i][j] = false;
            }
        }
        return false;
    }
    
    
    public boolean check(char[][] board, int y, int x, int ind, String word, boolean[][] vis){
        if(ind == word.length())
            return true;
        if(y < board.length - 1 && !vis[y+1][x]){
        	vis[y+1][x] = true;
            if(word.charAt(ind) == board[y+1][x] && check(board, y+1, x, ind+1, word, vis))
                return true;
            vis[y+1][x] = false;
        }
        if(y > 0 && !vis[y-1][x]){
        	vis[y-1][x] = true;
            if(word.charAt(ind) == board[y-1][x] && check(board, y-1, x, ind+1, word, vis))
                return true;
            vis[y-1][x] = false;
        }
        if(x < board[0].length - 1 && !vis[y][x+1]){
        	vis[y][x+1] = true;
            if(word.charAt(ind) == board[y][x+1] && check(board, y, x+1, ind+1, word, vis))
                return true;
            vis[y][x+1] = false;
        }
        if(x > 0 && !vis[y][x-1]){
        	vis[y][x-1] = true;
            if(word.charAt(ind) == board[y][x-1] && check(board, y, x-1, ind+1, word, vis))
                return true;
            vis[y][x-1] = false;
        }
        
        return false;
    }
}

// Code by Md Zaid Alam