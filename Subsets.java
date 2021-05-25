class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        add(nums, 0, ans);
        return ans;
    }
    
    public void add(int[] a, int ind, List<List<Integer>> ans){
        if(ind == a.length)
            return;
        int n = ans.size();
        for(int i = 0; i < n; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < ans.get(i).size(); j++){
                list.add(ans.get(i).get(j));
            }
            list.add(a[ind]);
            ans.add(list);
        }
        
        add(a, ind+1, ans);
    }
}

// Code by Md Zaid Alam