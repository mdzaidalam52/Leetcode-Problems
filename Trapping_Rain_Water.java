class Solution {
    public int trap(int[] height) {
        if(height.length == 0)
            return 0;
        int[] left = new int[height.length], right = new int[height.length];
        left[0] = height[0];
        for(int i = 1; i < height.length; i++){
            left[i] = Math.max(left[i-1], height[i-1]);
        }
        right[right.length - 1] = height[right.length - 1];
        
        for(int i = right.length - 2; i >= 0; i--){
            right[i] = Math.max(right[i+1], height[i+1]);
        }
        
        int ans = 0;
        for(int i = 1; i < right.length - 1; i++){
            int k = Math.min(left[i], right[i]);
            if(k > height[i])
                ans += k - height[i]; 
        }
        return ans;
    }
}

// Code by Md Zaid Alam