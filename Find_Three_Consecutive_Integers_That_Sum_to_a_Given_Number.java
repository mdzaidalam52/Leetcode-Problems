class Solution {
    public long[] sumOfThree(long num) {
        if(num % 3 == 0){
            long[] ans = new long[]{num/3-1, num/3, num/3 + 1};
            return ans;
        }else{
            return new long[0];
        }
    }
}

// Code by Md Zaid Alam