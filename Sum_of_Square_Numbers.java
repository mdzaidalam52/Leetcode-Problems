class Solution {
    public boolean judgeSquareSum(int c) {
        if(Math.sqrt(c)%1.0 == 0)
            return true;
        
        for(int i = 1; i*i <= c/2; i++){
            if(Math.sqrt(c - i*i) % 1 == 0)
                return true;
        }
        
        return false;
    }
}

// Code by Md Zaid Alam