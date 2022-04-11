class Solution {
    public int calPoints(String[] ops) {
        Stack<Long> st = new Stack<>();
        for(String str: ops){
            if(str.equals("+")){
                long a = st.pop();
                long b = st.peek();
                st.push(a);
                st.push(a + b);
            }else if(str.equals("D")){
                st.push(2*st.peek());
            }else if(str.equals("C")){
                st.pop();
            }else{
                st.push(Long.parseLong(str));
            }
        }
        long ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }
        return (int)ans;
    }
}

// Code by Md Zaid Alam