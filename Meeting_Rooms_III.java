class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        PriorityQueue<Data> pq = new PriorityQueue<>((a, b) -> {
            if(a.end != b.end){
                return a.end - b.end;
            }
            return a.ind - b.ind;
        });
        boolean[] meet = new boolean[n];
        int[] vis = new int[n];
        vis[0] = 1;
        meet[0] = true;
        pq.add(new Data(meetings[0][1], 0));
        for(int i = 1; i < meetings.length; i++){
            while(!pq.isEmpty() && meetings[i][0] >= pq.peek().end){
                meet[pq.remove().ind] = false;
            }
            int k = check(meet);
            if(k >= 0){
                pq.add(new Data(meetings[i][1], k));
            }else{
                k = pq.peek().ind;
                pq.add(new Data(meetings[i][1] + pq.remove().end - meetings[i][0], k));
            }
            vis[k]++;
            meet[k] = true;
        }
        int max = vis[0], ans = 0;
        for(int i = 1; i < n; i++){
            if(max < vis[i]){
                max = vis[i];
                ans = i;
            }
        }
        return ans;
    }
    
    int check(boolean[] a){
        for(int i = 0; i < a.length; i++){
            if(!a[i]){
                return i;
            }
        }
        return -1;
    }
    
    class Data{
        int end, ind;
        Data(int end, int ind){
            this.end = end;
            this.ind = ind;
        }
    }
}

// Code by Md Zaid Alam