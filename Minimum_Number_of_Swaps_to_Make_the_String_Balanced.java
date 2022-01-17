class Solution {
    public int minSwaps(String s) {
        int n = 0;
        int ans = 0;
        for(char c: s.toCharArray()){
            if(c == '[')
                n++;
            else if(n > 0)
                n--;
            else
                ans++;
        }
        return (n&1) == 0 ? n/2 : n/2 + 1;
    }
}

// Code by Md Zaid Alam