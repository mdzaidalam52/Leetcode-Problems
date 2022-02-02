class Solution {
    public int minOperations(int n) {
        if(n == 1)
            return 0;
        if(n%2 == 1){
            n = (n-1)/2;
            return n*(n+1);
        }
        return (n/2)*(n/2);
    }
}

// Code by Md Zaid Alam