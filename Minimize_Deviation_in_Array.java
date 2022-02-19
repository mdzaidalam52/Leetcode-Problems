class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i: nums){
            if(i%2 == 1) i = i*2;
            min = Math.min(i, min);
            pq.add(i);
        }
        
        int ans = Integer.MAX_VALUE;
        while(pq.peek()%2 == 0){
            int max = pq.remove();
            ans = Math.min(max-min, ans);
            min = Math.min(min, max/2);
            pq.add(max/2);
        }
        
        return Math.min(pq.peek() - min, ans);
    }
}

// Code by Md Zaid Alam