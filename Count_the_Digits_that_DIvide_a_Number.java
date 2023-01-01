class Solution {
    public int countDigits(int num) {
        int ans = 0;
        int k = num;
        while(k > 0){
            if(k%10 != 0){
                if(num%(k%10) == 0){
                    ans++;
                }
            }
            k = k/10;
        }
        return ans;
    }
}

// Code by Md Zaid Alam