class Solution {
    public int maxArea(int[] height) {
        return ans(height, 0, height.length - 1, Math.min(height[0], height[height.length-1])*(height.length - 1));
    }
    
    int ans(int[] a, int s, int e, int answer){
        if(e == s){
            return answer;
        }
        if(a[s] < a[e]){
            if(answer < Math.min(a[s+1], a[e])*(e-s-1)){
                return ans(a, s+1, e, Math.min(a[s+1], a[e])*(e-s-1));
            }else{
                return ans(a, s+1, e, answer);
            }
        }else if(a[s] > a[e]){
            if(answer < Math.min(a[s], a[e-1])*(e-s-1)){
                return ans(a, s, e-1, Math.min(a[s], a[e-1])*(e-s-1));
            }else{
                return ans(a, s, e - 1, answer);
            }
        }else{
            if(a[s+1] > a[e-1]){
                if(answer < Math.min(a[s+1], a[e])*(e-s-1)){
                    return ans(a, s+1, e, Math.min(a[s+1], a[e])*(e-s-1));
                }else{
                    return ans(a, s+1, e, answer);
                }
            }else{
                if(answer < Math.min(a[s], a[e-1])*(e-s-1)){
                    return ans(a, s, e-1, Math.min(a[s], a[e-1])*(e-s-1));
                }else{
                    return ans(a, s, e - 1, answer);
                }
            }
        }
    }
}

// Code by Md Zaid Alam