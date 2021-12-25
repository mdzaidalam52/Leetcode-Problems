class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int top = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(i < k){
                pq.add(nums[i]);
                top = Math.min(top, nums[i]);
            }else{
                if(nums[i] > top){
                    pq.remove();
                    pq.add(nums[i]);
                    top = pq.peek();
                }
            }
        }
        return top;
    }
}

// Code by Md Zaid Alam