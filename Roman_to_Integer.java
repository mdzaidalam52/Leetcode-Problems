class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int last = 0;
        for(char c: s.toCharArray()){
            if(val(c) <= last){
                ans += val(c);
            }else{
                ans += val(c) - 2*last;
            }
            last = val(c);
        }
        return ans;
    }
    
    int val(char c){
        if(c == 'I'){
            return 1;
        }else if(c == 'V'){
            return 5;
        }else if(c == 'X'){
            return 10;
        }else if(c == 'L'){
            return 50;
        }else if(c == 'C'){
            return 100;
        }else if(c == 'D'){
            return 500;
        }else{
            return 1000;
        }
    }
}

// Code by Md Zaid Alam