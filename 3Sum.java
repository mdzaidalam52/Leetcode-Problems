class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i = 0; 
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        while(i < nums.length - 2 && nums[i] <= 0){
            int j = i+1;
            int k = nums.length-1;
            int sum = -nums[i];
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