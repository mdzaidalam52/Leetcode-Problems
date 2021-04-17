class Solution {
    public String intToRoman(int num) {
        StringBuilder str = new StringBuilder("");
        if(num/1000 != 0){
            if(num/1000 == 1){
                str.append("M");
            }else if(num/1000 == 2){
                str.append("MM");
            }else{
                str.append("MMM");
            }
        }
        num = num%1000;
        if(num/100 != 0){
            if(num/100 < 4){
                for(int i = 0; i < num/100; i++){
                    str.append("C");
                }
            }else if(num/100 == 4){
                str.append("CD");
            }else if(num/100 > 4 && num / 100 < 9){
                str.append("D");
                for(int i = 0; i < num/100 - 5; i++){
                    str.append("C");
                }
            }else{
                str.append("CM");
            }
        }
        
        num = num% 100;
        
        if(num/10 != 0){
            if(num/10 < 4){
                for(int i = 0; i < num/10; i++){
                    str.append("X");
                }
            }else if(num/10 == 4){
                str.append("XL");
            }else if(num/10 > 4 && num / 10 < 9){
                str.append("L");
                for(int i = 0; i < num/10 - 5; i++){
                    str.append("X");
                }
            }else{
                str.append("XC");
            }
        }
        num = num%10;
        
        if(num != 0){
            if(num < 4){
                for(int i = 0; i < num; i++){
                    str.append("I");
                }
            }else if(num == 4){
                str.append("IV");
            }else if(num > 4 && num < 9){
                str.append("V");
                for(int i = 0; i < num - 5; i++){
                    str.append("I");
                }
            }else{
                str.append("IX");
            }
        }
        
        return str.toString();
    }
}

// Code by Md Zaid Alam