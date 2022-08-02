class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] a1 = new int[edges.length], a2 = new int[edges.length];
        Arrays.fill(a1, -1);
        Arrays.fill(a2, -1);
        int count = 0;
        int ind = node1;
        while(ind >= 0 && a1[ind] == -1){
            a1[ind] = count++;
            ind = edges[ind];
        }
        ind = node2;
        count = 0;
        while(ind >= 0 && a2[ind] == -1){
            a2[ind] = count++;
            ind = edges[ind];
        }
        int ans = Integer.MAX_VALUE;
        ind = -1;
        for(int i = 0; i < edges.length; i++){
            if(a1[i] != -1 && a2[i] != -1 && ans > Math.max(a1[i], a2[i])){
                ans = Math.max(a1[i], a2[i]);
                ind = i;
            }
        }
        return ind;
    }
}

// Code by Md Zaid Alam