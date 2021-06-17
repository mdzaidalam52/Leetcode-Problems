class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return new int[]{-1, -1};
        
        int[] a = new int[2];
        
        a[0] = searchLowest(nums, 0, nums.length - 1, target);
        a[1] = a[0] == -1 ? -1 : searchLargest(nums, a[1], nums.length - 1, target);
        
        return a;
    }
    
    int searchLowest(int[] a, int s, int e, int k){
        if(s == e)
            return a[s] == k ? s : -1;
        
        int mid = (s+e)/2;
        
        if(a[mid] == k || a[mid] > k)
            return searchLowest(a, s, mid, k);
        
        return searchLowest(a, mid+1, e, k);
    }
    
    int searchLargest(int[] a, int s, int e, int k){
        if(s == e)
            return a[s] == k ? s : -1;
        
        int mid = (s+e)/2;
        
        if(a[mid] == k && a[mid+1] == k)
            return searchLargest(a, mid + 1, e, k);
        
        if(a[mid] < k)
            return searchLargest(a, mid + 1, e, k);
        
        return searchLargest(a, s, mid, k);
    }
}

// Code by Md Zaid Alam