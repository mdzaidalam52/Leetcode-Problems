class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> max = new LinkedList<>(), min = new LinkedList<>();
        int ans = 1, j = 0;
        max.add(nums[0]);
        min.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            while(!max.isEmpty() && nums[i] > max.peekLast()){
                max.removeLast();
            }
            while(!min.isEmpty() && nums[i] < min.peekLast()){
                min.removeLast();
            }
            max.addLast(nums[i]);
            min.addLast(nums[i]);
            if(max.peekFirst() - min.peekFirst() <= limit){
                ans = Math.max(ans, i-j+1);
            }else{
                while(max.peekFirst() - min.peekFirst() > limit){
                    if(nums[j] == max.peekFirst()){
                        max.removeFirst();
                    }
                    if(nums[j] == min.peekFirst()){
                        min.removeFirst();
                    }
                    j++;
                }
                ans = Math.max(i-j+1, ans);
            }
        }
        return ans;
    }
}

// Code by Md Zaid Alam