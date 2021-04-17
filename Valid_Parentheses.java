class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '[' || c == '(' || c == '{'){
                st.push(c);
            }else if(c == ']'){
                if(st.isEmpty() || st.peek() != '['){
                    return false;
                }else{
                    st.pop();
                }
            }else if(c == ')'){
                if(st.isEmpty() || st.peek() != '('){
                    return false;
                }else{
                    st.pop();
                }
            }else if(c == '}'){
                if(st.isEmpty() || st.peek() != '{'){
                    return false;
                }else{
                    st.pop();
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

// Code by Md Zaid Alam