class Solution {
    public int minimumNumbers(int num, int k) {
        if(num == 0)
            return 0;
        if(k == 5){
            if(num%10 == 5){
                return 1;
            }else if(num%10 == 0){
                return 2;
            }else{
                return -1;
            }
        }else if(k % 10 == 0){
            if(num%10 == 0){
                return 1;
            }else{
                return -1;
            }
        }else if(k%2 == 1){
            return check(num, k);
        }else{
            if(num%2 == 0){
                return check(num, k);
            }else{
                return -1;
            }
        }
    }
    
    public int check(int num, int k){
        int ans = 1;
        while(ans <= 10 && k*ans <= num){
            if((num - (k*ans))%10 == 0){
                return ans;
            }else{
                ans++;
            }
        }
        return -1;        
    }
}

// Code by Md Zaid Alam