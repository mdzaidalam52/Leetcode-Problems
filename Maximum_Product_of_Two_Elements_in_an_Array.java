class Solution {
    public int maxProduct(int[] nums) {
        int a = 0, b = 0;
        for(int i: nums){
            if(a <= i){
                b = a;
                a = i;
            }else if(b < i){
                b = i;
            }
        }
        return (b-1)*(a-1);
    }
}

// Code by Md Zaid Alam