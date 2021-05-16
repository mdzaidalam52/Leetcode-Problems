class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < l.length; i++){
            int n = r[i] - l[i] + 1;
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            HashSet<Integer> set = new HashSet<>();
            for(int j = l[i]; j <= r[i]; j++){
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                set.add(nums[j]);
            }
            
            if((max - min)%(n-1) != 0){
                ans.add(false);
                continue;
            }
            
            int m = (max - min) / (n-1);
            
            while(min != max){
                min += m;
                if(!set.contains(min)){
                    ans.add(false);
                    break;
                }
            }
            if(ans.size() == i)
                ans.add(true);
        }
        return ans;
    }
}

// Code by Md Zaid Alam