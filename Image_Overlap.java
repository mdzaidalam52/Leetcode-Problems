class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, check(img1, img2, i, j));
            }
        }
        return ans;
    }

    public int check(int[][] a, int[][] b, int y, int x) {
        int n = a.length;
        int ans1 = 0, ans2 = 0, ans3 = 0, ans4 = 0;
        for (int i = y; i < n; i++) {
            for (int j = x; j < n; j++) {
                if (a[i][j] == b[i - y][j - x] && a[i][j] == 1) {
                    ans1++;
                }
                if (a[i - y][j - x] == b[i][j] && b[i][j] == 1) {
                    ans2++;
                }
                if (a[i - y][j] == b[i][j - x] && a[i - y][j] == 1) {
                    ans3++;
                }
                if (a[i][j - x] == b[i - y][j] && a[i][j - x] == 1) {
                    ans4++;
                }

            }
        }
        return Math.max(ans1, Math.max(ans2, Math.max(ans3, ans4)));
    }
}

// Code by Md Zaid Alam