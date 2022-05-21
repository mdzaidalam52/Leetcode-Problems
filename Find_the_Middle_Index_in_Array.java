class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] l = new int[nums.length], r = new int[nums.length];
        l[0] = nums[0];
        int n = nums.length;
        if(n == 1)
            return 0;
        r[n-1] = nums[n-1];
        for(int i = 1; i < n; i++){
            l[i] += l[i-1] + nums[i];
            r[n-i-1] += r[n-i] + nums[n-1-i];
        }
        if(r[1] == 0)
            return 0;
        for(int i = 1; i < n-1; i++){
            if(l[i-1] == r[i+1])
                return i;
        }
        if(l[nums.length-2] == 0)
            return n-1;
        return -1;
    }
}

// Code by Md Zaid Alam