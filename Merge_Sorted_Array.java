class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] t = new int[n+m];
        int i = 0, k = 0, j = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                t[k] = nums1[i];
                i++;
            }else{
                t[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        if(i < m){
            while(i < m){
                t[k] = nums1[i];
                i++;
                k++;
            }
        }else{
            while(j < n){
                t[k] = nums2[j];
                j++;
                k++;
            }
        }
        i = 0;
        for(int val : t){
            nums1[i] = val;
            i++;
        }
    }
}

// Code by Md Zaid Alam