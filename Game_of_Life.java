class Solution {
    public void gameOfLife(int[][] board) {
        int n = board.length, m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count = 0;
                if (check(i - 1, j, n, m) && (board[i - 1][j] == 1 || board[i - 1][j] == -1))
                    count++;
                if (check(i, j - 1, n, m) && (board[i][j - 1] == 1 || board[i][j - 1] == -1))
                    count++;
                if (check(i - 1, j - 1, n, m) && (board[i - 1][j - 1] == 1 || board[i - 1][j - 1] == -1))
                    count++;
                if (check(i + 1, j, n, m) && (board[i + 1][j] == 1 || board[i + 1][j] == -1))
                    count++;
                if (check(i, j + 1, n, m) && (board[i][j + 1] == 1 || board[i][j + 1] == -1))
                    count++;
                if (check(i + 1, j + 1, n, m) && (board[i + 1][j + 1] == 1 || board[i + 1][j + 1] == -1))
                    count++;
                if (check(i + 1, j - 1, n, m) && (board[i + 1][j - 1] == 1 || board[i + 1][j - 1] == -1))
                    count++;
                if (check(i - 1, j + 1, n, m) && (board[i - 1][j + 1] == 1 || board[i - 1][j + 1] == -1))
                    count++;

                if (board[i][j] == 0) {
                    if (count == 3) {
                        board[i][j] = 2;
                    }
                } else {
                    if (count < 2 || count > 3) {
                        board[i][j] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (board[i][j] == -1)
                    board[i][j] = 0;
                else if (board[i][j] == 2)
                    board[i][j] = 1;

    }

    boolean check(int i, int j, int n, int m) {
        return i > -1 && i < n && j > -1 && j < m;
    }
}

// Code by Md Zaid Alam