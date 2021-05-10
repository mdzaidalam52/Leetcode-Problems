class Solution {
    public int numTimesAllBlue(int[] light) {
        int ans = 0;
        int max = 0;
        for(int i = 0; i < light.length; i++){
            if(max < light[i]){
                max = light[i];
            }
            if(max == i+1){
                ans++;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam