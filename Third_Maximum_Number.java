class Solution {
    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if(nums[i] > a){
                c = b;
                b = a;
                a = nums[i];
            }else if(nums[i] > b && nums[i] != a){
                c = b;
                b = nums[i];
            }else if(nums[i] > c && nums[i] != b && nums[i] != a){
                c = nums[i];
            }
        }
        
        if(c != Long.MIN_VALUE){
            return (int)c;
        }
        return (int)a;
    }
}

// Code by Md Zaid Alam