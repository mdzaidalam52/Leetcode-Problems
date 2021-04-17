class Solution {
    public int lengthOfLastWord(String s) {
        int j = 0;
        boolean bool = false;
        for(int i = s.length()-1; i >= 0; i--){
            if(!bool){
                if(s.charAt(i) == ' '){
                    continue;
                }else{
                    j = i;
                    bool = true;
                }
            }
            if(bool){
                if(s.charAt(i) == ' '){
                    j -= i;
                    return j;
                }
            }
        }
        if(bool){
            return j+1;
        }else{
            return 0;
        }
    }
}

// Code by Md Zaid Alam