class Solution {
    public int search(int[] nums, int target) {
        int min = minIndex(nums, 0, nums.length - 1);
        if(min == 0){
        	int ans = Arrays.binarySearch(nums, target);
        	return ans >= 0 ? ans : -1;
        }
        
        if(nums[nums.length - 1] >= target){
            return binary(nums, min, nums.length - 1, target);
        }
        return binary(nums, 0, min - 1, target);
    }
    
    public int minIndex(int[] a, int s, int e){
        if(s == e)
            return s;
        int mid = (s+e)/2;
        
        if(a[mid] > a[e])
            return minIndex(a, mid + 1, e);
        
        return minIndex(a, s, mid);
    }
    
    public int binary(int[] a, int s, int e, int k){
        if(s == e)
            return a[s] == k ? s : -1;
        
        int mid = (s+e)/2;
        
        if(a[mid] == k)
            return mid;
        if(a[mid] > k)
            return binary(a, s, mid, k);
        return binary(a, mid+1, e, k);
            
    }
}

// Code by Md Zaid Alam