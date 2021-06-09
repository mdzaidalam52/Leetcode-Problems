class Solution {
    public int countSegments(String s) {
        if(s == null){
            return 0;
        }
        s.trim();
        if(s.isEmpty()){
            return 0;
        }
        int ind = 0;
        while(ind < s.length() && s.charAt(ind) == ' '){
            ind++;
        }
        if(ind == s.length())
            return 0;
        
        
        int e = s.length() - 1;
        while(e >= 0 && s.charAt(e) == ' '){
            e--;
        }
            
        int ans = 1;
        for(int i = ind; i <= e; i++){
            if(s.charAt(i) == ' '){
                ans++;
                while(i < s.length() && s.charAt(i) == ' ') i++;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam