class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int[] arr = new int[100];
        Arrays.fill(arr, -1);
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        for(int i = nums.length-1; i >= 0; i--){
            int ind = 0;
            while(nums[i] > 0){
                if((nums[i]&1) == 1){
                    arr[ind] = i;
                }
                ind++;
                nums[i] = nums[i] >> 1;
            }
            for(int j = 0; j <= 35; j++){
                if(arr[j] != -1)
                    ans[i] = Math.max(arr[j] - i + 1, ans[i]);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam