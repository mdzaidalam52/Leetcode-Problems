class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] nge = nge(temperatures);
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = nge[i] - i;
        }
        return ans;
    }

    int[] nge(int[] a){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[a.length];
        for(int i = a.length-1; i >= 0; i--){
            while(!st.isEmpty() && a[st.peek()] <= a[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }else{
                ans[i] = i;
            }
            st.push(i);
        }
        return ans;
    }
}

// Code by Md Zaid Alam