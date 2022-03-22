class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0;
        for(int i = 1; i < nums.length-1;){
            int prev = i-1;
            int next = i+1;
            while(next < nums.length && nums[next] == nums[i])
                next++;
            if(next == nums.length)
                break;
            if((nums[i] > nums[i-1] && nums[i] > nums[next]) || (nums[i] < nums[i-1] && nums[i] < nums[next]))
                ans++;
            i = next;
        }
        return ans;
    }
}

// Code by Md Zaid Alam