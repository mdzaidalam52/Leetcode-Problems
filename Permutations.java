class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> a = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++){
            set.add(i);
            a.add(nums[i]);
            solve(ans, nums, a, set, i);
            a = new ArrayList<>();
            set = new HashSet<>();
            
        }
        return ans;
    }
    public void solve(List<List<Integer>> ans, int[] n, List<Integer> a, HashSet<Integer> set, int ind){
        if(set.size() == n.length){
            List<Integer> list = new ArrayList<>();
            for(int val : a)
                list.add(val);
            ans.add(list);
            set.remove(ind);
            a.remove(a.size()-1);
            return;
        }
        for(int i = 0; i < n.length; i++){
            if(!set.contains(i)){
                a.add(n[i]);
                set.add(i);
                solve(ans, n, a, set, i);
            }
            
        }
        a.remove(a.size()-1);
        set.remove(ind);
    }
}

// Code by Md Zaid Alam
