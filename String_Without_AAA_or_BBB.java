class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder str = new StringBuilder();
        int x = 0, y = 0;
        while(a != 0 || b != 0){
            if(a >= b){
                if(x < 2){
                    str.append('a');
                    a--;
                    x++;
                    y = 0;
                }else{
                    str.append('b');
                    y++;
                    x = 0;
                    b--;
                }
            }else{
                if(y < 2){
                    str.append('b');
                    b--;
                    y++;
                    x = 0;
                }else{
                    str.append('a');
                    x++;
                    y = 0;
                    a--;
                }
            }
        }
        
        return str.toString();
    }
}

// Code by Md Zaid Alam