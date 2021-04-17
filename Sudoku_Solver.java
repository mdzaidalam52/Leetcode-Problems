class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
    
    static boolean solve(char[][] a, int x, int y) {
		boolean bool = false;
		if(a[x][y] != '.') {
			if(x == 8 && y == 8) {
				return true;
			}else if(y == 8) {
				return solve(a, x+1, 0);
			}else {
				return solve(a, x, y+1);
			}
		}else {
			bool = true;
			for(int i = 1; i <= 9; i++) {
				if(check(a, x, y, Integer.toString(i).charAt(0))) {
					a[x][y] = Integer.toString(i).charAt(0);
					
					if(x == 8 && y == 8) {
						return true;
					}else if(y == 8) {
						if(solve(a, x+1, 0)){
							return true;
						}
					}else {
						if(solve(a, x, y+1)) {
							return true;
						}
					}
				}
				
			}
		}
		if(bool)
			a[x][y] = '.';
		return false;
	}
	
	static boolean check(char[][] a, int x, int y, char k) {
		
		for(int i = 0 ; i < 9; i++) 
			if(a[i][y] == k || a[x][i] == k) 
				return false;
		
		for(int i = 3*(x/3); i < 3*(x/3) + 3; i++)
			for(int j = 3*(y/3); j < 3*(y/3) + 3; j++) 
				if(a[i][j] == k)
					return false;
		
		return true;
	}
}

// Code by Md Zaid Alam
