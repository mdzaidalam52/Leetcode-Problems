class Solution {
    public String interpret(String command) {
        StringBuilder ans = new StringBuilder();
        int n = command.length();
        for(int i = 0; i < n; ){
            if(command.charAt(i) == 'G'){
                ans.append('G');
                i++;
            }else if(command.charAt(i+1) == ')'){
                ans.append('o');
                i += 2;
            }else{
                ans.append("al");
                i += 4;
            }
        }
        return ans.toString();
    }
}

// Code by Md Zaid Alam