class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> a = new LinkedList<>();
        for(int i : map.keySet()){
            a.add(i);
            map.put(i, map.get(i) - 1);
            solve(map, a, ans, nums.length);
            map.put(i, map.get(i) + 1);
            a.remove(0);
        }
        return ans;
    }
    
    public void solve(HashMap<Integer, Integer> map, List<Integer> a, List<List<Integer>> ans, int n){
        if(a.size() == n){
            List<Integer> an = new LinkedList<>();
            an.addAll(a);
            ans.add(an);
            return;
        }
        for(int i : map.keySet()){
            if(map.get(i) != 0){
                a.add(i);
                map.put(i, map.get(i) - 1);
                solve(map, a, ans, n);
                map.put(i, map.get(i) + 1);
                a.remove(a.size() - 1);
            }
        }
    }
}

// Code by Md Zaid Alam