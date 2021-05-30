class Solution {
    public int integerReplacement(int n) {
        int ans = 0;
        if(n == Integer.MAX_VALUE)
            return 32;
        while(n != 1){
        	if(n == 3) {
        		ans += 2;
        		break;
        	}
            if((n&1) == 0){
                n = n >> 1;
            }else if((n+1)%4 == 0){
                n++;
            }else{
                n--;
            }
            ans++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam