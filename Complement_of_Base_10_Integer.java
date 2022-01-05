class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0)
            return 1;
        
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.insert(0, (n&1) == 0 ? '1' : '0');
            n = n >> 1;
        }
        for(char c : sb.toString().toCharArray()){
            n = (n << 1) + (c - '0');
        }
        return n;
    }
}

// Code by Md Zaid Alam