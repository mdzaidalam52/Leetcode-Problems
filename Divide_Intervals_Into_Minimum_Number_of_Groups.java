class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;
        for(int[] a: intervals){
            while(!pq.isEmpty() && pq.peek() < a[0]){
                pq.remove();
            }
            pq.add(a[1]);
            ans = Math.max(pq.size(), ans);
        }
        return ans;
    }
}

// Code by Md Zaid Alam