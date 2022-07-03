class Solution {
    public int countHousePlacements(int n) {
        final int mod = 1000000007;
        long a = 1, b = 1, temp = 0;
        while(n-- > 0){
            temp = a;
            a = (a+b)%mod;
            b = temp;
        }
        return (int)((a * a) % mod);
    }
}

// Code by Md Zaid Alam