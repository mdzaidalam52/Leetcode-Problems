class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && (nums[i] == nums[i-1] || nums[i] == nums[i-1]+1)){
                continue;
            }
            if(i < n-1 && (nums[i] == nums[i+1] || nums[i] == nums[i+1]-1)){
                continue;
            }
            l.add(nums[i]);
        }
        return l;
    }
}

// Code by Md Zaid Alam