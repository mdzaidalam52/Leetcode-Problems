class Solution {
    public boolean hasAlternatingBits(int n) {
        int count = (n&1);
        n = n >> 1;
        while(n > 0){
            if(count == (n&1))
                return false;
            count = (n&1);
            n = n >> 1;
        }
        return true;
    }
}

// Code by Md Zaid Alam