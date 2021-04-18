class Solution {
    public int addDigits(int num) {
        while(num/10 != 0){
            int k = num;
            num = 0;
            while(k != 0){
                num += k%10;
                k /= 10;
            }
        }
        return num;
    }
}

// Code by Md Zaid Alam