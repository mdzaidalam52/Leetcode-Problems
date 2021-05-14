class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] a = new int[nums.length];
        Arrays.fill(a, 1);
        for(int i = 1; i < a.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    a[i] = Math.max(a[i], a[j] + 1);
                }
            }
        }
        int max = 1;
        for(int val : a){
            max = Math.max(val, max);
        }
        
        return max;
    }
}

// Code by Md Zaid Alam