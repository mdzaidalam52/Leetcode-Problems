class NumArray {
    int[] a;
    int n;
    public NumArray(int[] nums) {
        n = nums.length;
        a = new int[n*4];
        for(int i = 0; i < n; i++){
            update(i, nums[i]);
        }
    }
    
    public void update(int index, int val) {
        update(0, n-1, val, index, 0);
    }
    
    private void update(int s, int e, int val, int index, int ind){
        if(s == e){
            a[ind] = val;
            return;
        }
        int mid = (s+e)/2;
        if(mid >= index)
            update(s, mid, val, index, 2*ind+1);
        else
            update(mid + 1, e, val, index, 2*ind+2);
        a[ind] = a[2 * ind + 1] + a[2 * ind + 2];
    }
    
    public int sumRange(int left, int right) {
        return sum(left, right, 0, n-1, 0);
    }
    
    private int sum(int s, int e, int l, int r, int ind){
        if(s <= l && r <= e)
            return a[ind];
        if(l > e || s > r)
            return 0;
        int mid = (l+r)/2;
        return sum(s, e, l, mid, 2*ind+1) + sum(s, e, mid+1, r, 2*ind+2);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */

 // Code by Md Zaid Alam