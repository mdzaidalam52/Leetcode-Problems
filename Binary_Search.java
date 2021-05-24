class Solution {
    public int search(int[] nums, int target) {
        return binary_search(nums, target, 0, nums.length - 1);
    }
    
    public int binary_search(int[] a, int k, int i, int j){
        if(i == j){
            if(a[i] == k)
                return i;
            else
                return -1;
        }
        if(j < i)
            return -1;
        int mid = (i+j)/2;
        if(a[mid] == k)
            return mid;
        if(a[mid] < k)
            return binary_search(a, k, mid + 1, j);
        return binary_search(a, k, i, mid - 1);
    }
}

// Code by Md Zaid Alam