class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] diff = new int[n];
        for(int i = 0; i < n; i++){
            diff[i] = nums1[i] - nums2[i];
        }
        
        int max = 0, min = 0;
        int currx = 0, currn = 0;
        for(int i: diff){
            currx += i;
            currn += i;
            if(currx < 0){
                currx = 0;
            }else{
                max = Math.max(max, currx);
            }
            if(currn > 0){
                currn = 0;
            }else{
                min = Math.min(min, currn);
            }
        }
        
        int a = 0, b = 0;
        for(int i = 0; i < n; i++){
            a += nums1[i];
            b += nums2[i];
        }
        return Math.max(a - min, b + max);
    }
}

// Code by Md Zaid Alam