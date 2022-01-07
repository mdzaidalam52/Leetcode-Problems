class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        vis[0] = true;
        
        Queue<Integer> q = new LinkedList<>();
        for(int i : rooms.get(0)){
            q.add(i);
            vis[i] = true;
        }
        
        while(!q.isEmpty()){
            for(int a : rooms.get(q.peek())){
                if(vis[a])
                    continue;
                q.add(a);
                vis[a] = true;
            }
            q.remove();
        }
        for(boolean b: vis){
            if(!b)
                return false;
        }
        return true;
    }
}

// Code by Md Zaid Alam