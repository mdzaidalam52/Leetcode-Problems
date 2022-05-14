class Solution {
    public String removeDigit(String number, char digit) {
        int ind = number.length();
        char prev = number.charAt(number.length() - 1);
        for(int i = number.length()-1; i >= 0; i--){
            if(number.charAt(i) == digit){
                if(ind == number.length()){
                    ind = i;
                }else if(prev > digit){
                    ind = i;
                }
            }else{
                prev = number.charAt(i);
            }
        }
        StringBuilder str = new StringBuilder(number);
        str.deleteCharAt(ind);
        return str.toString();
    }
}

// Code by Md Zaid Alam