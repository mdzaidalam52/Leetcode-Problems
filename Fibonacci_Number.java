class Solution {
    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int a = 0, b = 1, t = a;
        for(int i = 2; i <= n; i++){
            t = b;
            b += a;
            a = t;
        }
        return b;
    }
}

// Code by Md Zaid Alam