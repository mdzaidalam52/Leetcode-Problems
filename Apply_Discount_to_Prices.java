class Solution {
    public String discountPrices(String sentence, int discount) {
        discount = 100 - discount;
        StringBuilder ans = new StringBuilder();
        int n = sentence.length();
        for(int i = 0; i < n; i++){
            ans.append(sentence.charAt(i));
            if(sentence.charAt(i) == '$' && (i == 0 || sentence.charAt(i-1) == ' ') && i < n-1 && '0' < sentence.charAt(i+1) && sentence.charAt(i+1) <= '9'){
                long k = value(i+1, sentence);
                if(k == -1)
                    continue;
                i += String.valueOf(k).length();
                k *= discount;
                String str;
                if(k < 10){
                    str = "0.0" + String.valueOf(k);
                }else if(k < 100){
                    str = "0." + String.valueOf(k);
                }else{
                    StringBuilder s = new StringBuilder(String.valueOf(k));
                    s.insert(s.length() - 2, ".");
                    str = s.toString();
                }
                ans.append(str);
            }
        }
        return ans.toString();
    }
    
    long value(int ind, String str){
        StringBuilder sb = new StringBuilder();
        while(ind < str.length() && '0' <= str.charAt(ind) && str.charAt(ind) <= '9'){
            sb.append(str.charAt(ind));
            ind++;
        }
        if(ind == str.length() || str.charAt(ind) == ' ')
            return Long.parseLong(sb.toString());
        else
            return -1;
    }
}

// Code by Md Zaid Alam