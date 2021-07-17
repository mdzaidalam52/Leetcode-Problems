class Solution {
    public boolean isPowerOfThree(int n) {
        long k = (long)(1162261467)*3;
        if(n > 0 && (k % n) == 0)
            return true;
        return false;
    }
}

// Code by Md Zaid Alam