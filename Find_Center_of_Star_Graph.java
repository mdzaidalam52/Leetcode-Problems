class Solution {
    public int findCenter(int[][] edges) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < 2; i++){
            if(set.contains(edges[i][0])){
                return edges[i][0];
            }else{
                set.add(edges[i][0]);
            }
            
            if(set.contains(edges[i][1])){
                return edges[i][1];
            }else{
                set.add(edges[i][1]);
            }
        }
        return -1;
    }
}

// Code by Md Zaid Alam