class Solution {
    public boolean isPerfectSquare(int num) {
        
        long s = 1, e = num;
        while(true){
            long mid = (s+e) >> 1;
            
            if(mid*mid > num)
                e = mid;
            else if(mid*mid < num)
                s = mid+1;
            else return true;
            
            if(s == e)
                return false;
        }
        
    }
}

// Code by Md Zaid Alam