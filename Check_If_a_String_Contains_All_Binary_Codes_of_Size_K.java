class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n = 0;
        int num = 0;
        boolean[] bool = new boolean[(1<<k) + 1];
        StringBuilder str = new StringBuilder("0");
        int l = 0;
        for(int i = 0; i < k-1 && i < s.length(); i++){
            l = (l << 1) + (s.charAt(i) - '0');
            num = (num<<1) + 1;
        }
        for(int i = k-1; i < s.length(); i++){
            l = l & num;
            l = (l<<1) + (s.charAt(i) - '0');
            if(!bool[l]){
                bool[l] = true;
                n++;
            }
        }
        return n == (1<<k);
    }
}

// Code by Md Zaid Alam