class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0)
            return 0;
        boolean bool = dividend > 0 == divisor > 0;
        if(bool){
            return dividend / divisor >= 0 ? dividend / divisor : Integer.MAX_VALUE;
        }else{
            return dividend/divisor;
        }
    }
}

// Code by Md Zaid Alam