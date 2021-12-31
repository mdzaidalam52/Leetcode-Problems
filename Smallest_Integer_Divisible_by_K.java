class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0)
            return -1;
        long a = 1;
        for(int i = 1; i <= k; i++){
            if(a % k == 0)
                return i;
            a = (a*10 + 1) % k;
        }
        return -1;
    }
}

// Code by Md Zaid Alam