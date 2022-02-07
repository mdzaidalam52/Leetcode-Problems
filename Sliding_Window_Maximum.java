class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> d = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            while(!d.isEmpty() && d.peekLast() < nums[i]){
                d.removeLast();
            }
            d.addLast(nums[i]);
        }
        int n = nums.length; 
        int[] ans = new int[n - k + 1];
        ans[0] = d.peekFirst();
        for(int i = k; i < n; i++){
            if(d.peekFirst() == nums[i-k])
                d.removeFirst();
            while(!d.isEmpty() && d.peekLast() < nums[i]){
                d.removeLast();
            }
            d.addLast(nums[i]);
            ans[i-k+1] = d.peekFirst();
        }
        return ans;
    }
}

// Code by Md Zaid Alam