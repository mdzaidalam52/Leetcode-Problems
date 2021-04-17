class Solution {
    public int reverse(int x) {
        int sign = 1;
        if(x < 0){
            sign = -1;
            x = -x;
        }
        long ans = 0;
        while(x != 0){
            ans = ans*10;
            ans += x%10;
            x = x/10;
        }
        ans *= sign;
        if(ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE){
            return 0;
        }else{
            return (int)ans;
        }
    }
}

// Code by Md Zaid Alam