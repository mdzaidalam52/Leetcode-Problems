class Solution {
    public int convertTime(String current, String correct) {
        int ch = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3, 5));
        int nh = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3, 5));
        int ans = nh - ch;
        return ans / 60 + (ans%60) / 15 + (ans%15) / 5 + (ans%5);
    }
}

// Code by Md Zaid Alam