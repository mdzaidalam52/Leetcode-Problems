class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            List<List<Integer>> a = threeSum(nums, target - nums[i], i + 1);
            for(List<Integer> list : a){
                list.add(nums[i]);
                ans.add(list);
            }
            while(i < nums.length - 3 && nums[i] == nums[i+1]) i++;
        }
        return ans;
        
    }
    
    public List<List<Integer>> threeSum(int[] nums, int target, int i) {
        List<List<Integer>> ans = new ArrayList<>();
        while(i < nums.length - 2){
            int j = i+1;
            int k = nums.length-1;
            int sum = target-nums[i];
            while(j < k){
                if(nums[j] + nums[k] == sum){
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    ans.add(a);
                    while(j < k && nums[j+1] == nums[j]) j++;
                    while(j < k && nums[k-1] == nums[k]) k--;
                    j++;
                    k--;
                }else if(nums[j] + nums[k] < sum){
                    while(j < k && nums[j+1] == nums[j]) j++;
                    j++;
                }else{
                    while(j < k && nums[k-1] == nums[k]) k--;
                    k--;
                }
            }
            while(i < nums.length-1 && nums[i] == nums[i+1]) i++;
            i++;
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam