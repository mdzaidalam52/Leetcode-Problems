class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int n = queens.length;
        int[][] board = new int[8][8];
        for (int i = 0; i < n; i++) {
            board[queens[i][0]][queens[i][1]] = 1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = king[0] + 1; i < 8; i++) {
            if (board[i][king[1]] == 1) {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(king[1]);
                ans.add(l);
                break;
            }
        }

        for (int i = king[0] - 1; i >= 0; i--) {
            if (board[i][king[1]] == 1) {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(king[1]);
                ans.add(l);
                break;
            }
        }

        for (int i = king[1] + 1; i < 8; i++) {
            if (board[king[0]][i] == 1) {
                List<Integer> l = new ArrayList<>();
                l.add(king[0]);
                l.add(i);
                ans.add(l);
                break;
            }
        }

        for (int i = king[1] - 1; i >= 0; i--) {
            if (board[king[0]][i] == 1) {
                List<Integer> l = new ArrayList<>();
                l.add(king[0]);
                l.add(i);
                ans.add(l);
                break;
            }
        }

        for (int i = 1; king[0] + i < 8 && king[1] + i < 8; i++) {
            if (board[king[0] + i][king[1] + i] == 1) {
                List<Integer> l = new ArrayList<>();
                l.add(king[0] + i);
                l.add(king[1] + i);
                ans.add(l);
                break;
            }
        }

        for (int i = 1; king[0] + i < 8 && king[1] - i >= 0; i++) {
            if (board[king[0] + i][king[1] - i] == 1) {
                List<Integer> l = new ArrayList<>();
                l.add(king[0] + i);
                l.add(king[1] - i);
                ans.add(l);
                break;
            }
        }

        for (int i = 1; king[0] - i >= 0 && king[1] + i < 8; i++) {
            if (board[king[0] - i][king[1] + i] == 1) {
                List<Integer> l = new ArrayList<>();
                l.add(king[0] - i);
                l.add(king[1] + i);
                ans.add(l);
                break;
            }
        }

        for (int i = 1; king[0] - i >= 0 && king[1] - i >= 0; i++) {
            if (board[king[0] - i][king[1] - i] == 1) {
                List<Integer> l = new ArrayList<>();
                l.add(king[0] - i);
                l.add(king[1] - i);
                ans.add(l);
                break;
            }
        }

        return ans;
    }
}

// Code by Md Zaid Alam