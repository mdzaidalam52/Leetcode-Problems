class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums)
            xor = xor ^ i;
        
        int k = 1;
        while((xor & k) == 0)
            k = k << 1;
        
        int[] a = new int[2];
        for(int i : nums){
            if((k&i) == 0)
                a[0] = a[0] ^ i;
            else
                a[1] = a[1] ^ i;
        }
        return a;
    }
}

// Code by Md Zaid Alam