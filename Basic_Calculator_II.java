class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;
        Stack<Long> stack = new Stack<>();
        long num = 0;
        char sign = '+';
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                num = num*10 + s.charAt(i) - '0';
            }
            if((!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ') || i == s.length() - 1){
                if(sign == '+'){
                    stack.push(num);
                }else if(sign == '-'){
                    stack.push(-num);
                }else if(sign == '*'){
                    stack.push(stack.pop() * num);
                }else{
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while(!stack.isEmpty())
            ans += stack.pop();
        
        return ans;
    }
}

// Code by Md Zaid Alam