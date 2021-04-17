class Solution {
    public int[] plusOne(int[] digits) {
        boolean bool = false;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                bool = true;
                digits[i]++;
                break;
            }
        }
        if(bool){
            return digits;
        }else{
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
    }

}

// Code by Md Zaid Alam