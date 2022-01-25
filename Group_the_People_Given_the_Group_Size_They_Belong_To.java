class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = groupSizes.length;
        
        for(int i = 0; i < n; i++){
            if(map.containsKey(groupSizes[i])){
                map.get(groupSizes[i]).add(i);
                if(map.get(groupSizes[i]).size() == groupSizes[i]){
                    ans.add(map.get(groupSizes[i]));
                    map.remove(groupSizes[i]);
                }
            }else if(groupSizes[i] == 1){
                List<Integer> a = new ArrayList<>();
                a.add(i);
                ans.add(a);
            }else{
                map.put(groupSizes[i], new ArrayList<>());
                map.get(groupSizes[i]).add(i);
            }
        }
        
        return ans;
    }
}

// Code by Md Zaid Alam