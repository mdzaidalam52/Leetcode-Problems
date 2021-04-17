class Solution {
    public String convert(String s, int n) {
        StringBuilder[] str = new StringBuilder[n];
        for(int i = 0; i < n; i++){
            str[i] = new StringBuilder("");
        }
        
        int k = 0;
        while(true){
            for(int i = 0; i < n; i++){
                if(k >= s.length()){
                    break;
                }
                str[i].append(s.charAt(k));
                k++;                
            }
            for(int i = n - 2; i > 0; i--){
                if(k >= s.length()){
                    break;
                }
                str[i].append(s.charAt(k));
                k++;
            }
            if(k >= s.length()){
                break;
            }
        }
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i < n; i++){
            ans.append(str[i].toString());
        }
        return ans.toString();
    }
}

// Code by Md Zaid Alam