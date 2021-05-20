class Solution {
    public int numRookCaptures(char[][] board) {
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++)
                if(board[i][j] == 'R')
                    return check(board, i, j);
        
        return 0;
    }
    public int check(char[][] board, int i, int j){
        int count = 0;
        for(int x = i-1; x >= 0; x--){
            if(board[x][j] == 'p'){
                count++;
                break;
            }else if(board[x][j] == 'B'){
                break;
            }
        }
        for(int x = i+1; x < 8; x++){
            if(board[x][j] == 'p'){
                count++;
                break;
            }else if(board[x][j] == 'B'){
                break;
            }
        }
        for(int x = j-1; x >= 0; x--){
            if(board[i][x] == 'p'){
                count++;
                break;
            }else if(board[i][x] == 'B'){
                break;
            }
        }
        for(int x = j+1; x < 8; x++){
            if(board[i][x] == 'p'){
                count++;
                break;
            }else if(board[i][x] == 'B'){
                break;
            }
        }
        return count;
    }
}

// Code by Md Zaid Alam