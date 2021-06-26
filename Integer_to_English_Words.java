class Solution {
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        StringBuilder str = new StringBuilder();
        int i = 0; 
        while(num > 0){
            word(num%1000, str, i);
            num /= 1000;
            i++;
        }
        return str.toString().trim();
    }
    
    public void word(int n, StringBuilder str, int ind){
        if(n == 0)
            return;
        str.insert(0, unit(ind));
        if(n%100 < 10 || n%100 > 19)
        str.insert(0, ones(n%10));
        int k = n%10;
        n /= 10;
        str.insert(0, tens(n%10, k));
        n/=10;
        str.insert(0, hundreds(n%10));
    }
    
    public String unit(int a){
        switch(a){
            case 0:
                return "";
            case 1:
                return "Thousand ";
            case 2:
                return "Million ";
            case 3:
                return "Billion ";
            
        }
        return"";
    }
    
    public String ones(int a){
        switch(a){
            case 0:
                return "";
            case 1:
                return "One ";
            case 2:
                return "Two ";
            case 3:
                return "Three ";
            case 4:
                return "Four ";
            case 5:
                return "Five ";
            case 6:
                return "Six ";
            case 7:
                return "Seven ";
            case 8:
                return "Eight ";
            case 9:
                return "Nine ";
        }
        return null;
    }
    
    public String tens(int t, int o){
        if(t == 1){
            switch(o){
                case 0:
                    return "Ten ";
                case 1:
                    return "Eleven ";
                case 2:
                    return "Twelve ";
                case 3:
                    return "Thirteen ";
                case 4:
                    return "Fourteen ";
                case 5:
                    return "Fifteen ";
                case 6:
                    return "Sixteen ";
                case 7:
                    return "Seventeen ";
                case 8:
                    return "Eighteen ";
                case 9:
                    return "Nineteen ";
            }
        }else{
            switch(t){
                case 0:
                    return "";
                case 2:
                    return "Twenty " ;
                case 3:
                    return "Thirty ";
                case 4:
                    return "Forty ";
                case 5:
                    return "Fifty ";
                case 6:
                    return "Sixty ";
                case 7:
                    return "Seventy ";
                case 8:
                    return "Eighty ";
                case 9:
                    return "Ninety ";
                
            }
        }
        return null;
    }
    
    public String hundreds(int a){
        if(a == 0)
            return "";
        return ones(a) + "Hundred ";
    }
}

// Code by Md Zaid Alam