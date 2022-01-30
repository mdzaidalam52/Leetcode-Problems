class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n], right = new int[n];
        Arrays.fill(right, n);
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
            	left[i] = st.peek() + 1;
            }else{
                left[i] = 0;
            }
            st.push(i);
        }
        st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(!st.isEmpty()){
            	right[i] = st.peek() - 1;
            }else{
                right[i] = n - 1;
            }
            st.push(i);
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = Math.max((right[i] - left[i] + 1)*heights[i], ans);
        }
        return ans;
    }
}

// Code by Md Zaid Alam.
