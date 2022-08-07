class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1, e = 1;
        for(int i: nums)
            e = Math.max(e, i);
        int ans = e;
        while(s < e){
            int mid = (e+s)/2;
            if(check(nums, mid) <= threshold){
                ans = mid;
                e = mid;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
    
    int check(int[] a, int k){
        int ans = 0;
        for(int i: a){
            ans += (i%k) == 0 ? (i/k) : ((i/k)+1);
        }
        return ans;
    }
}

// Code by Md Zaid Alam