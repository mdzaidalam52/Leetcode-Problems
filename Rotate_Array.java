class Solution {
    public void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k%nums.length-1);
        reverse(nums, k%nums.length, nums.length - 1);
    }
    
    public void reverse(int[] a, int s, int e){
        int t;
        while(s < e){
            t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }
}

// Code by Md Zaid Alam