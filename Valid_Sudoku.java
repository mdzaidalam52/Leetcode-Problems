class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] == '.')
                    continue;
                if(!check(board, i, j))
                    return false;
            }
        }
        
        return true;
    }
    
    boolean check(char[][] a, int x, int y) {
		
		for(int i = x+1; i < 9; i++)
            if(a[i][y] == a[x][y])
                return false;
        
        
        for(int i = y + 1; i < 9; i++)
            if(a[x][i] == a[x][y])
                return false;
        
		
		for(int i = 3*(x/3); i < 3*(x/3) + 3; i++)
			for(int j = 3*(y/3); j < 3*(y/3) + 3; j+=2) 
				if(a[i][j] == a[x][y] && (x != i && y != j))
					return false;
		
		return true;
	}
}

// Code by Md Zaid Alam