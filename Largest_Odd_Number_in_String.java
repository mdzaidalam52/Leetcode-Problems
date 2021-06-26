class Solution {
    public String largestOddNumber(String num) {
        int i;
        
        for(i = num.length() - 1; i >= 0; i--){
            if((int)(num.charAt(i) - '0') % 2 == 1){
                break;
            }
        }
        return num.substring(0, i+1);
    }
}

// Code by Md Zaid Alam