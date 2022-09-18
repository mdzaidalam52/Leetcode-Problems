class Solution {
    public int lengthOfLIS(int[] nums, int k) {
        int max = nums[0];
        for(int i: nums)
            max = Math.max(i, max);
        SegmentTree seg = new SegmentTree(max+1);
        int ans = 1;
        
        for(int i = 0; i < nums.length; i++){
            int l = seg.get(Math.max(nums[i]-k, 0), Math.max(nums[i]-1, 0));
            seg.put(nums[i], l+1);
            ans = Math.max(l+1, ans);
        }
        return ans;
    }
    
    class SegmentTree{
        int[] a;
        final int n;

        SegmentTree(int n){
            this.n = n;
            a = new int[4*n];
        }

        void put(int ind, int val){
            put(0, n-1, 0, ind, val);
        }

        private void put(int s, int e, int index, int ind, int val){
            if(s == e){
                a[index] = val;
                return;
            }
            int mid = (s+e)/2;
            if(mid >= ind){
                put(s, mid, 2*index+1, ind, val);
            }else{
                put(mid+1, e, 2*index+2, ind, val);
            }
            a[index] = Math.max(a[2*index+1], a[2*index+2]);
        }

        int get(int l, int h){
            return get(0, n-1, 0, l, h);
        }

        private int get(int s, int e, int ind, int l, int h){
            if(s >= l && h >= e)
                return a[ind];
            if(s > h || l > e)
                return Integer.MIN_VALUE;
            int mid = (s+e)/2;
            return Math.max(get(s, mid, 2*ind + 1, l, h), get(mid+1, e, 2*ind+2, l, h));
        }
    }
}

// Code by Md Zaid Alam