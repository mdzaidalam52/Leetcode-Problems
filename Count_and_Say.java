class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        return say(countAndSay(n-1));
    }
    
    String say(String str){
        int k = 1;
        char last = str.charAt(0);
        StringBuilder ans = new StringBuilder("");
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == last){
                k++;
            }else{
                ans.append(Integer.toString(k));
                ans.append(last);
                last = str.charAt(i);
                k = 1;
            }
        }
        ans.append(Integer.toString(k));
        ans.append(last);
        return ans.toString();
    }
}

// Code by Md Zaid Alam