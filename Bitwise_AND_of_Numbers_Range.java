class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        Stack<Integer> m = new Stack<>(), n = new Stack<>();
        
        for(int i = 0; i < 32; i++){
            m.push((left&1));
            n.push((right&1));
            left = left >> 1;
            right = right >> 1;
        }
        
        int ans = 0;
        boolean bool = true;
        for(int i = 0; i < 32; i++){
            if(m.peek() != n.peek()){
                bool = false;
            }
            ans = ans << 1;
            if(bool){
                ans += m.pop();
                n.pop();
            }
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam