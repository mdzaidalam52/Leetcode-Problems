class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
            list.add(new ArrayList<>());
        
        for(int i = 0; i < trust.length; i++){
            list.get(trust[i][0]-1).add(trust[i][1] - 1);
        }
        
        int count = 0;
        int ind = -1;
        for(int i = 0; i < n; i++){
            if(list.get(i).size() == 0){
                if(count == 0){
                    count++;
                    ind = i;
                }else{
                    return -1;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            if(i == ind)
                continue;
            
            if(!list.get(i).contains(ind))
                return -1;
        }
        
        return ind + 1;
    }
}

// Code by Md Zaid Alam