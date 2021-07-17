class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0)
            return false;
        int k = 0;
        while((n&1) == 0){
            n = n >> 1;
            k++;
        }
        
        if(n == 1 && (k&1) == 0){
            return true;
        }
        return false;
    }
}

// Code by Md Zaid Alam