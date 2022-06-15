class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans = 0;
        int prev = 0;
        for (int i = 0; i < brackets.length; i++) {
            if (income > brackets[i][0]) {
                ans += ((brackets[i][0] - prev) * brackets[i][1]) / ((double) 100.0);
            } else {
                ans += ((income - prev) * brackets[i][1]) / ((double) 100.0);
                break;
            }
            prev = brackets[i][0];
        }
        return ans;
    }
}

// Code by Md Zaid Alam