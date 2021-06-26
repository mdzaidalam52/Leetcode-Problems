class Solution {
    public int mySqrt(int x) {
        long s = 1, e = x;
        while(true){
            long mid = (s+e) >> 1;
            
            if(mid*mid > x)
                e = mid;
            else if(mid*mid < x)
                s = mid+1;
            else return (int)mid;
            
            if(s == e)
                return (int)s-1;
        }
    }
}

// Code by Md Zaid Alam