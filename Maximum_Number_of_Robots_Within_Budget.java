class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        Deque<Long> q = new LinkedList<>();
        long sum = 0;
        int ans = 0;
        int i = 0, j = 0, n = chargeTimes.length;
        while(j < n){
            while(!q.isEmpty() && q.peekLast() < chargeTimes[j]){
                q.removeLast();
            }
            q.addLast((long)chargeTimes[j]);
            sum = sum + runningCosts[j];
            while(i <= j && (q.size() > 0 ? q.peekFirst() : 0) + (j-i+1)*sum > budget){
                if(q.peekFirst() == chargeTimes[i]){
                    q.removeFirst();
                }
                sum -= runningCosts[i];
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}

// Code by Md Zaid Alam