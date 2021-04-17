class Solution {
    public String addBinary(String a, String b) {
        int i = 0;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        
        LinkedList<Character> c = new LinkedList<>();
        while(i < Math.min(a.length(), b.length())){
            if(carry == 0){
                if(a.charAt(a.length() - 1 - i) == '0'){
                    c.add(0, b.charAt(b.length() - 1 - i));
                }else{
                    if(b.charAt(b.length() - 1 -i) == '0'){
                        c.add(0, '1');
                    }else{
                        c.add(0, '0');
                        carry++;
                    }
                }
            }else{
                if(a.charAt(a.length() - 1 - i) == '0'){
                    if(b.charAt(b.length() - 1 - i) == '0'){
                        c.add(0, '1');
                        carry--;
                    }else{
                        c.add(0, '0');
                    }
                }else{
                    if(b.charAt(b.length() - 1 -i) == '0'){
                        c.add(0, '0');
                    }else{
                        c.add(0, '1');
                    }
                }
            }
           i++;
        }
        String s = a.length() > b.length() ? a : b;
        if(carry == 0){
            for(i = s.length() - i - 1; i >= 0; i--){
                c.add(0, s.charAt(i));
            }
        }else{
            boolean bool = false;
            for(i = s.length() - i - 1; i >= 0; i--){
                if(!bool && s.charAt(i) == '0'){
                    c.add(0, '1');
                    bool = true;
                    carry--;
                }else if(bool){
                    c.add(0, s.charAt(i));
                }else {
                    c.add(0, '0');
                }
            }
        }
            
        if(carry == 1){
           c.add(0, '1');
        }
            
        for(char ch : c){
            ans.append(ch);
        }
        return ans.toString();
    }
}

// Code by Md Zaid Alam