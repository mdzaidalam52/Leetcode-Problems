class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int s = 1, e = nums[0];
        for(int i: nums){
            e = Math.max(i, e);
        }
        while(s < e){
            int mid = s + ((e-s)/2);
            if(check(nums, maxOperations, mid)){
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return s;
    }
    
    boolean check(int[] a, int k, int s){
        for(int i: a){
            if(i > s){
                k -= (i%s) == 0 ? ((i/s)-1) : (i/s);
            }
        }
        return k >= 0;
    }
}

// Code by Md Zaid Alam