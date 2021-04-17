class NumArray {
    long[] a;
    public NumArray(int[] nums) {
        a = new long[nums.length];
        if(nums.length > 0){
            a[0] = nums[0];
        }
        for(int i = 1; i < nums.length; i++){
            a[i] = a[i-1] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        if(i > 0){
            return (int)(a[j] - a[i-1]);
        }else{
            return (int)a[j];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

//  Code by Md Zaid Alam