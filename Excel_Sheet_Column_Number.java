class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        int n = columnTitle.length();
        int prod = 1;
        for(int i = n - 1; i >= 0; i--){
            ans += prod * (columnTitle.charAt(i) - 'A' + 1);
            prod = prod * 26;
        }
        return ans;
    }
}

// Code by Md Zaid Alam