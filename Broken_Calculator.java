class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans = 0;
        while (target > startValue) {
            if (target % 2 == 0) {
                target = target >> 1;
            } else {
                target++;
            }
            ans++;
        }
        return ans + startValue - target;
    }
}

// Code by Md Zaid Alam