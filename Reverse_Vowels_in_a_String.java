class Solution {
    public String reverseVowels(String s) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                q.add(i);
                st.push(s.charAt(i));
            }
        }
        char[] ans = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(!q.isEmpty() && q.peek() == i){
            	q.remove();
                ans[i] = st.pop();
            }else{
                ans[i] = s.charAt(i);
            }
        }
        
        return new String(ans);
    }
    
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

// Code by Md Zaid Alam