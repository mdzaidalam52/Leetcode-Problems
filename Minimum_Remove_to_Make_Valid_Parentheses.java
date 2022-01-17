class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(ans.length());
                ans.append(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(!st.isEmpty()){
                    st.pop();
                    ans.append(')');
                }
            }else{
                ans.append(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            ans.replace(st.peek(), st.pop() + 1, "");
        }
        return ans.toString();
    }
}

// Code by Md Zaid Alam