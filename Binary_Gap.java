class Solution {
    public int binaryGap(int n) {
        boolean bool = false;
        int j = -1;
        int ans = 0;
        while(n != 0){
            if((n&1) == 1){
                if(bool){
                    ans = Math.max(ans, j);
                }else{
                    bool = true;
                }
                j = 1;
            }else{
                j++;
            }
            n = n >> 1;
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam