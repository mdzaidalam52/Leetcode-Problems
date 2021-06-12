class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0, j = 1, k = nums.length - 1;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        while(i < nums.length - 2){
            j = i+1;
            k = nums.length - 1;
            int l = target - nums[i];
            while(j < k){
                if(nums[j] + nums[k] == l) 
                    return target;
                else{
                    if(min > Math.abs(l - nums[j] - nums[k])){
                        min = Math.abs(l - nums[j] - nums[k]);
                        ans = nums[i] + nums[j] + nums[k];
                    }
                        
                    if(nums[j] + nums[k] > l){
                        while(k > j && nums[k] == nums[k-1]) k--;
                        k--;
                    }else{
                        while(k > j && nums[j] == nums[j+1]) j++;
                        j++;
                    }
                }
            }
            while(i < nums.length - 2 && nums[i] == nums[i+1]) i++;
            
            i++;
        }
        
        
        return ans;
    }
}

// Code by Md Zaid Alam