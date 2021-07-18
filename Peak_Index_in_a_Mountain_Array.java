class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int ans = 0;
        for(int i = 0; i < arr.length -1; i++){
            if(max < arr[i]){
                max = arr[i];
                ans = i;
            }
                
        }
        return ans;
    }
}

// Code by Md Zaid Alam