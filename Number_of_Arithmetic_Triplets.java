class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            int k = Arrays.binarySearch(nums, nums[i] + diff);
            int l = Arrays.binarySearch(nums, nums[i] + 2*diff);
            if(k > 0 && l > 0){
                int a = 1, b = 1;
                while(k < nums.length-1 && nums[k] == nums[k+1]){
                    a++;
                    k++;
                }
                while(l < nums.length-1 && nums[l] == nums[l+1]){
                    b++;
                    l++;
                }
                ans += a*b;
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam