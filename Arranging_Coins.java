class Solution {
    public int arrangeCoins(int n) {
        if(n == 0) return 0;
        long i = 1;
        for(; (i*(i+1))/2 < n; i++){
            
        }
        Long l = new Long(i);
        if((i*(i+1))/2 == n)
            return l.intValue();
        else
            return l.intValue()-1;
    }
}

// Code by Md Zaid Alam